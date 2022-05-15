package Prototype_;

public class Client2 {
	public static void main(String[] args) throws Exception {
		Customer2 customer = null;
		Customer2 customer2 = null;
		Customer2 customer3 = null;
		Address address;
		address = new Address("开福区洪山路98号", "414000");
		customer = new Customer2("张三", 20, address);
		customer2 = customer.clone();
		System.out.println("原对象的基本信息如下：");
		System.out.println(customer.toString());
		System.out.println("浅克隆对象的基本信息如下：");
		System.out.println(customer2.toString());
		System.out.println("-------修改原对象的姓名以及地址，分别显示原对象和浅克隆对象的信息-----------------------");
		customer.setName("李四");
		customer.address.setIp_name("长沙学院");
		System.out.println(customer.toString());
		System.out.println(customer2.toString());
		System.out.println("判断原对象和浅克隆对象是否是同一个引用对象？" + (customer == customer2));
		System.out.println("判断原对象和浅克隆对象的地址引用是否是同一个引用对象？" + (customer.address == customer2.address));
		System.out.println("-------显示原对象和深克隆对象的信息----------------------------------");
		System.out.println("原对象"+customer);
		customer3=customer.deepclone();
		customer.setName("张三");
		address.setIp_name("开福区洪山路98号");
		System.out.println("深克隆对象"+customer3);
		System.out.println("-------修改原对象的姓名以及地址，分别显示原对象和浅克隆对象的信息-----------------------");
		customer.setName("李四");
		customer.address.setIp_name("长沙学院");
		System.out.println("判断原对象和深克隆对象是否是同一个引用对象？" + (customer == customer3));
		System.out.println("判断原对象和深克隆对象的地址引用是否是同一个引用对象？" + (customer.address == customer3.address));
	}
}
