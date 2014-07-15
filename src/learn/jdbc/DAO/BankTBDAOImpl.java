package learn.jdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import learn.jdbc.db.DBManager;
import learn.jdbc.po.Bank;
import learn.jdbc.po.Operator;

public class BankTBDAOImpl implements BankTBDAO {

	@Override
	public void add(Bank bank) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		Connection conn;
		String sql="insert into BankTB (ID,PID,GID,Name,Level,Reserved,Status) values(?,?,?,?,?,?,?)";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			int index=1;
			pstmt.setString(index++, bank.getID());
			pstmt.setString(index++, bank.getPID());
			pstmt.setString(index++, bank.getGID());
			pstmt.setString(index++, bank.getName());
			pstmt.setString(index++, bank.getLevel());
			pstmt.setString(index++, bank.getReserved());
			pstmt.setString(index++, bank.getStatus());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String ID) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		Connection conn;
		String sql="delete from BankTB where ID=?";
		try {
			conn = DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, ID);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Bank> queryBank() {
		// TODO Auto-generated method stub
		List<Bank> BankList=new ArrayList<Bank>();  //存储查询结果
		String sql="select * from BankTB";
		Connection conn=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		try{
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Bank bank=new Bank();
				bank.setID(rs.getString("ID"));
				bank.setPID(rs.getString("PID"));
				bank.setGID(rs.getString("GID"));
				bank.setName(rs.getString("Name"));
				bank.setLevel(rs.getString("Level"));
				bank.setReserved(rs.getString("Reserved"));
				bank.setStatus(rs.getString("Status"));
				BankList.add(bank);
				}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			DBManager.dbClose(rs, pstmt, conn);
		}
		return BankList;				//封装查询结果到BankList，并返回

	}

	@Override
	public void update(Bank bank) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		Connection conn;
		String sql="update BankTB set ID=?,PID=?,GID=?,Name=?,Level=?,Status=?,Reserved=? where ID =?";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			int index=1;
			pstmt.setString(index++,bank.getID());
			//pstmt.setString(index++, Operator.getOperatorID());
			pstmt.setString(index++,bank.getPID());
			pstmt.setString(index++,bank.getGID());
			pstmt.setString(index++,bank.getName());
			pstmt.setString(index++,bank.getLevel());
			pstmt.setString(index++,bank.getStatus());
			pstmt.setString(index++,bank.getReserved());
			pstmt.setString(index++,bank.getID());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bank.getName());
	}

	@Override
	public Bank queryByID(String ID) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		String sql="select * from BankTB where ID=?";
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, ID);
			rs=pstmt.executeQuery();
			if(rs.next()){
				bank.setID(rs.getString("ID"));
				bank.setPID(rs.getString("PID"));
				bank.setGID(rs.getString("GID"));
				bank.setName(rs.getString("Name"));
				bank.setLevel(rs.getString("Level"));
				bank.setStatus(rs.getString("Status"));
				bank.setReserved(rs.getString("Reserved"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.dbClose(rs, pstmt, conn);
		}
		return bank;
	}

}
