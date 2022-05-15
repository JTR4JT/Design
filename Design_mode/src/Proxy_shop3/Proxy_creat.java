package Proxy_shop3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy_creat implements InvocationHandler {
	private Object object;
	private User user =new User();
	private int num=-1;
	// 传什么对象就生成什么代理
	public Proxy_creat(Object object) {
		// TODO Auto-generated constructor stub
		this.object = object;
	}

	@Override
	// 参数1代表代理类的实例，2代表参数method代表需要代理的方法，args代表代理方法的参数数组
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		System.out.println("客户" + user.getName());
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
		order.productName= new Product().name;//也可以通过构造方法赋值，利用泛型来决定产品的类别
		return order;
	}

}
