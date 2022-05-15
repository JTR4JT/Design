package Proxy_shop3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		ShopSystem shop=new Product();
		Proxy_creat handel=new Proxy_creat(shop);
		ShopSystem proxy=(ShopSystem)Proxy.newProxyInstance(shop.getClass().getClassLoader(), shop.getClass().getInterfaces(), handel);
		System.out.println(proxy.sell(100));
		User user =new User();
		user.setName("张山");
		proxy.change(handel.creat(),user, 300);//错误，没有向下转型，不会调用父类里面的方法?
		proxy.change(new Proxy_creat(shop).creat(), user, 200);
		
	}
}
