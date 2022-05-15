package Prototype_;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer2 implements Cloneable, Serializable {
	String name;
	int age;
	Address address;
	public Customer2(String name,int age,Address address) {
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
	public Customer2 clone(){
		Object obj=null;
		try {
			obj=super.clone();
			return (Customer2)obj;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("出现错误");
		}
		return null;
		
	}
	public Customer2 deepclone() throws Exception{
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bao);
		oos.writeObject(this);
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		return (Customer2)ois.readObject();
	
	}
	public String toString() {
		return "客户姓名:"+this.name+"，年龄是:"+this.age+"地址是:"+this.address.ip_name+",邮编是:"+this.address.code;
		
	}
}
