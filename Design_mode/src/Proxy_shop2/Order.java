package Proxy_shop2;
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
		return customerName+"ÂòÁË"+productNum+"¼þ"+productName;
	}
}
