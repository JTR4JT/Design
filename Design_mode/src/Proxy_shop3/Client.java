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
		user.setName("��ɽ");
		proxy.change(handel.creat(),user, 300);//����û������ת�ͣ�������ø�������ķ���?
		proxy.change(new Proxy_creat(shop).creat(), user, 200);
		
	}
}
