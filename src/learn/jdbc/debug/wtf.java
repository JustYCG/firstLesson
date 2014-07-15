package learn.jdbc.debug;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import learn.jdbc.db.DBManager;
import learn.jdbc.po.Operator;

public class wtf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String OperatorID="9201213250";
		String Password="123456";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Operator operator = null;
		try {
			conn = DBManager.getConnection();
			String sql = "select Operator.OperatorName,BankTB.PID,BankTB.Name from Operator INNER JOIN BankTB on Operator.BankID=BankTB.ID where Operator.OperatorID = ? and Operator.Password= ? ";
			//String sql2="select PID,Name from BankTB where BankID =?";
			System.out.println(sql);
			pstmt=conn.prepareStatement(sql);
			//pstmt2=conn2.prepareStatement(sql2);
			pstmt.setString(1, OperatorID);
			pstmt.setString(2,Password);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString(3));
				operator=new Operator();
				operator.setPID(rs.getString("BankTB.PID"));
				operator.setOperatorName(rs.getString("Operator.OperatorName"));
				operator.setName(rs.getString("BankTB.Name"));
			}
			
		} catch (Exception e) {
				e.printStackTrace();

			}
		System.out.println(operator.getName());
	//System.out.println(rs.getString(1));
	}}



