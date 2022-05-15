package Proxy_shop;

public class Client {
	public static void main(String[] args) {
		Product shop=new Product();
		Proxy shop2=new Proxy(shop, "уехЩ");
	System.out.println(	shop2.sell(20));
	}

}
