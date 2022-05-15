package Proxy_shop;
//商品名称阿迪达斯鞋子,商品数量120
public class Order {
	String productName;
	int productNum;
	String customerName;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return customerName+"买了"+productNum+"件"+productName;
	}
}
