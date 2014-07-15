package learn.jdbc.DAO;

import java.sql.*;
import java.util.*;






import learn.jdbc.db.DBManager;
import learn.jdbc.po.Operator;

public class OperatorDAOImpl implements OperatorDAO {
	
	public Operator login(String OperatorID, String Password) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Operator operator = null;
		try {
			conn = DBManager.getConnection();
			String sql = "select Operator.OperatorName,BankTB.PID,BankTB.Name from Operator INNER JOIN BankTB on Operator.BankID=BankTB.ID where Operator.OperatorID = ? and Operator.Password= ? ";
			
			//System.out.println(sql);
			pstmt=conn.prepareStatement(sql);
			//pstmt2=conn2.prepareStatement(sql2);
			pstmt.setString(1, OperatorID);
			pstmt.setString(2,Password);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				operator=new Operator();
				operator.setPID(rs.getString("BankTB.PID"));
				operator.setOperatorName(rs.getString("Operator.OperatorName"));
				operator.setName(rs.getString("BankTB.Name"));
				}
			/*pstmt2.setString(1,operator.getBankID());
			rs2=pstmt.executeQuery();
			if(rs2.next()){
				operator.setPID(rs2.getString("PID"));
				operator.setName(rs2.getString("Name"));
			}
			*//*else{
				operator=null;
			}*/
		} catch (Exception e) {
			e.printStackTrace();

		}  finally{
			DBManager.dbClose(rs, pstmt, conn);
		}

		return operator;
	}
	
	//查询所有信息
	public List<Operator> queryAll() {
		// TODO Auto-generated method stub
		List<Operator> OperatorList=new ArrayList<Operator>();  //存储查询结果
		String sql="select * from Operator";
		Connection conn=null;
		ResultSet rs=null;
		Statement st=null;
		try{
			conn=DBManager.getConnection();
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				Operator operator=new Operator();
				operator.setBankID(rs.getString("BankID"));
				operator.setOperatorID(rs.getString("OperatorID"));
				operator.setSigCod(rs.getString("SigCod"));
				operator.setNode(rs.getString("Node"));
				operator.setStatus(rs.getInt("Status"));
				operator.setPassword(rs.getString("Password"));
				operator.setPermission(rs.getString("Permission"));
				operator.setOperatorName(rs.getString("OperatorName"));
				operator.setChecker(rs.getString("Checker"));
				operator.setCreator(rs.getString("Creator"));
				operator.setCreateDate(rs.getString("CreateDate"));
				operator.setReserved(rs.getString("Reserved"));
				/*product.setId(rs.getInt("Id"));
				product.setProductName(rs.getString("product_Name"));
				proList.add(product);*/
				OperatorList.add(operator);
				}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			DBManager.dbClose(rs, st, conn);
		}
		return OperatorList;				//封装查询结果到OperatorList，并返回

}

	//根据主键删除产品信息
	/*public void delete(int Id) {								
		// TODO Auto-generated method stub
		String sql="delete from product_infor where Id="+Id;
		
		Connection conn;
		try {
			conn = DBManager.getConnection();
			Statement stat=conn.createStatement();
			stat.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void add(int Id, String productName) {
		// TODO Auto-generated method stub
		String sql="inser into product_infro (Id,product_Name) values ("+Id+",("+productName+")";
		Connection  conn;
		try {
			conn = DBManager.getConnection();
			Statement stat=conn.createStatement();
			stat.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	public void add(Operator Operator) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		Connection conn;
		String sql="insert into Operator (BankID,OperatorID,SigCod,Node,Status,Permission,Password,OperatorName,Creator,Checker,CreateDate,Reserved) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			int index=1;
			pstmt.setString(index++, Operator.getBankID());
			pstmt.setString(index++, Operator.getOperatorID());
			pstmt.setString(index++, Operator.getSigCod());
			pstmt.setString(index++, Operator.getNode());
			pstmt.setInt(index++, Operator.getStatus());
			pstmt.setString(index++, Operator.getPermission());
			pstmt.setString(index++, Operator.getPassword());
			pstmt.setString(index++, Operator.getOperatorName());
			pstmt.setString(index++, Operator.getCreator());
			pstmt.setString(index++, Operator.getChecker());
			pstmt.setString(index++, Operator.getCreateDate());
			pstmt.setString(index++, Operator.getReserved());
			pstmt.execute();
		/*	if (n > 0) {
				flag = true;
			}
			DBManger.dbClose1(ps, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void delete(String OperatorID) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		Connection conn;
		String sql="delete from Operator where OperatorID=?";
		try {
			
			System.out.println(sql);
			conn = DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, OperatorID);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void update(Operator Operator) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		Connection conn;
		String sql="update Operator set BankID=?,OperatorID=?,SigCod=?,Node=?,Status=?,Permission=?,Password=?,OperatorName=?,Creator=?,Checker=?,CreateDate=?,Reserved=? where OperatorID =? order by OperatorID";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			int index=1;
			pstmt.setString(index++, Operator.getBankID());
			pstmt.setString(index++, Operator.getOperatorID());
			pstmt.setString(index++, Operator.getSigCod());
			pstmt.setString(index++, Operator.getNode());
			pstmt.setInt(index++, Operator.getStatus());
			pstmt.setString(index++, Operator.getPermission());
			pstmt.setString(index++, Operator.getPassword());
			pstmt.setString(index++, Operator.getOperatorName());
			pstmt.setString(index++, Operator.getCreator());
			pstmt.setString(index++, Operator.getChecker());
			pstmt.setString(index++, Operator.getCreateDate());
			pstmt.setString(index++, Operator.getReserved());
			pstmt.setString(index++, Operator.getOperatorID());//problem
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Operator queryByOperatorID(String OperatorID) {
		// TODO Auto-generated method stub
		Operator operator=new Operator();
		String sql="select * from Operator where OperatorID=?";
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, OperatorID);
			rs=pstmt.executeQuery();
			if(rs.next()){
				operator.setBankID(rs.getString("BankID"));
				operator.setOperatorID(rs.getString("OperatorID"));
				operator.setSigCod(rs.getString("SigCod"));
				operator.setNode(rs.getString("Node"));
				operator.setStatus(rs.getInt("Status"));
				operator.setPassword(rs.getString("Password"));
				operator.setPermission(rs.getString("Permission"));
				operator.setOperatorName(rs.getString("OperatorName"));
				operator.setChecker(rs.getString("Checker"));
				operator.setCreator(rs.getString("Creator"));
				operator.setCreateDate(rs.getString("CreateDate"));
				operator.setReserved(rs.getString("Reserved"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.dbClose(rs, pstmt, conn);
		}
		
		
		return operator;
	}}
