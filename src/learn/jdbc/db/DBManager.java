package learn.jdbc.db;

/*
 * �������ݿ�
 */
import java.sql.*;


public class DBManager {
	static String url="jdbc:mysql://localhost:3306/SealManagerDB";
	static String user="root";
	static String password="root";

	
	//��������
	static{				
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	//�������
	public static Connection getConnection()throws SQLException{				
		Connection con=DriverManager.getConnection(url, user, password);
		return con;
	}
	
	//close����
	public static void dbClose(ResultSet rs,Statement st,Connection con){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(st!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}



