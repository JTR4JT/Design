package Proxy_shop;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbLink {
	private String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=UTF8";
	private String username = "root";
	private String password = "123456";
	
	//连接数据库方法
	public Connection get() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection(url, username, password);
		return con;
	}
	//关闭数据库方法
	public void close(java.sql.Connection con) throws Exception {
		
		if(con != null) {
			con.close();
		}
	}
	
 public static void main(String[] args) {
	 DbLink dbUtil = new DbLink(); 
		 try {
			 dbUtil.get(); 
			 System.out.println("数据库连接成功"); 
			 } catch (Exception e) { 
				 // TODO Auto-generated catch block 
				 e.printStackTrace(); //在命令行打印异常信息在程序中出错的位置及原因。
				 System.out.println("数据库连接错误"); 
				 } 
		 } 
}
