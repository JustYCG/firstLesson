package learn.jdbc.db;

/*
 * 连接数据库
 */
import java.sql.*;


public class DBManager {
	static String url="jdbc:mysql://localhost:3306/SealManagerDB";
	static String user="root";
	static String password="root";

	
	//加载驱动
	static{				
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	//获得连接
	public static Connection getConnection()throws SQLException{				
		Connection con=DriverManager.getConnection(url, user, password);
		return con;
	}
	
	//close操作
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



