package Proxy_shop;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbLink {
	private String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=UTF8";
	private String username = "root";
	private String password = "123456";
	
	//�������ݿⷽ��
	public Connection get() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection(url, username, password);
		return con;
	}
	//�ر����ݿⷽ��
	public void close(java.sql.Connection con) throws Exception {
		
		if(con != null) {
			con.close();
		}
	}
	
 public static void main(String[] args) {
	 DbLink dbUtil = new DbLink(); 
		 try {
			 dbUtil.get(); 
			 System.out.println("���ݿ����ӳɹ�"); 
			 } catch (Exception e) { 
				 // TODO Auto-generated catch block 
				 e.printStackTrace(); //�������д�ӡ�쳣��Ϣ�ڳ����г����λ�ü�ԭ��
				 System.out.println("���ݿ����Ӵ���"); 
				 } 
		 } 
}
