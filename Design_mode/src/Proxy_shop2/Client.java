package Proxy_shop2;

public class Client {
	public static void main(String[] args) {
		Product shop=new Product();
		Proxy shop3=new Proxy(shop, "����");
		System.out.println(	shop3.sell(100));
		Proxy shop2=new Proxy(shop, "����");
	System.out.println(	shop2.sell(100));
	}

}
