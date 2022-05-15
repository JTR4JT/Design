package Proxy_shop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Select_infornmation {
	DbLink link = new DbLink();
	List<Product> list = new ArrayList<Product>();
	List<Order> list2 = new ArrayList<Order>();
	public boolean selete_user_name(String name) throws Exception {
		Connection con = link.get();
		String sql = "select * from user";
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			if (name.equals(rs.getString("name"))) {

				return true;
			} else
				return false;

		}
		con.close();
		return false;
	}

	//获得产品信息
	public List<Product> selete_product(String name) throws Exception {

		Connection con = link.get();
		Statement statement = con.createStatement();
		String sql = "select * from product";
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			Product product = new Product();
			product.setName(rs.getString("name"));
			product.setNum(rs.getInt("num"));
			list.add(product);
		}

		return list;

	}
	public boolean selete_order(String name) throws Exception {

		Order order=new Order();
		Connection con = link.get();
		Statement statement = con.createStatement();
		String sql = "select * from order";
		ResultSet rs = statement.executeQuery(sql);
		
		while (rs.next()) {
			if (name.equals(rs.getString("customerName"))) {

				return true;
			} else
				return false;

		}
		return false;
		

	}
	//获得订单全部信息
	public List<Order> selete_order_all() throws Exception {

		Connection con = link.get();
		Statement statement = con.createStatement();
		String sql = "select * from order";
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			Order order=new Order();
			order.setCustomerName(rs.getString("customerName"));
			order.setProductName(rs.getString("productName"));
			order.setProductNum(rs.getInt("productNum"));
			list2.add(order);
		}

		return list2;

	}

}
