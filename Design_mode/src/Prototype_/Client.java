package Prototype_;

public class Client {
	public static void main(String[] args) {
		Customer customer = null;
		Customer customer2 = null;
		Customer customer3 = null;
		Address address;
		address = new Address("��������ɽ·98��", "414000");
		customer = new Customer("����", 20, address);
		customer2 = customer.clone();
		System.out.println("ԭ����Ļ�����Ϣ���£�");
		System.out.println(customer.toString());
		System.out.println("ǳ��¡����Ļ�����Ϣ���£�");
		System.out.println(customer2.toString());
		System.out.println("-------�޸�ԭ����������Լ���ַ���ֱ���ʾԭ�����ǳ��¡�������Ϣ-----------------------");
		customer.setName("����");
		customer.address.setIp_name("��ɳѧԺ");
		System.out.println(customer.toString());
		System.out.println(customer2.toString());
		System.out.println("�ж�ԭ�����ǳ��¡�����Ƿ���ͬһ�����ö���" + (customer == customer2));
		System.out.println("�ж�ԭ�����ǳ��¡����ĵ�ַ�����Ƿ���ͬһ�����ö���" + (customer.address == customer2.address));
		System.out.println("-------��ʾԭ��������¡�������Ϣ----------------------------------");
		System.out.println("ԭ����"+customer);
		customer3=customer.deepclone();
		customer.setName("����");
		address.setIp_name("��������ɽ·98��");
		System.out.println("���¡����"+customer3);
		System.out.println("-------�޸�ԭ����������Լ���ַ���ֱ���ʾԭ�����ǳ��¡�������Ϣ-----------------------");
		customer.setName("����");
		customer.address.setIp_name("��ɳѧԺ");
		System.out.println("�ж�ԭ��������¡�����Ƿ���ͬһ�����ö���" + (customer == customer3));
		System.out.println("�ж�ԭ��������¡����ĵ�ַ�����Ƿ���ͬһ�����ö���" + (customer.address == customer3.address));
	}
}
