package Proxy_shop3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy_creat implements InvocationHandler {
	private Object object;
	private User user =new User();
	private int num=-1;
	// ��ʲô���������ʲô����
	public Proxy_creat(Object object) {
		// TODO Auto-generated constructor stub
		this.object = object;
	}

	@Override
	// ����1����������ʵ����2�������method������Ҫ����ķ�����args����������Ĳ�������
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		System.out.println("�ͻ�" + user.getName());
		result = method.invoke(object, args);
//		num=Integer.parseInt(String.valueOf(args[0]));
//		num=Integer.parseInt(args[0].toString());
		return result;
		
	}

	public Order creat()
	{
		Order order = new Order();
		order.productNum=num;
		order.customerName=user.name;
		order.productName= new Product().name;//Ҳ����ͨ�����췽����ֵ�����÷�����������Ʒ�����
		return order;
	}

}
