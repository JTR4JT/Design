package Prototype_;

public class Customer implements Cloneable {
	String name;
	int age;
	Address address;
	public Customer(String name,int age,Address address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer clone(){
		Object obj=null;
		try {
			obj=super.clone();
			return (Customer)obj;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ִ���");
		}
		return null;
		
	}
	public Customer deepclone(){
		Object obj=null;
		try {
			obj=super.clone();
			Customer c=(Customer) obj;
			c.address=(Address) this.address.clone();
			return (Customer)obj;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ִ���");
		}
		return null;
		
	}
	public String toString() {
		return "�ͻ�����:"+this.name+"��������:"+this.age+"��ַ��:"+this.address.ip_name+",�ʱ���:"+this.address.code;
		
	}
	
}
