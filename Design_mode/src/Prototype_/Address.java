package Prototype_;

import java.io.Serializable;

public class Address implements Cloneable, Serializable{
	String ip_name;
	String code;
	public Address(String ip_name,String code) {
		// TODO Auto-generated constructor stub
		this.ip_name=ip_name;
		this.code=code;
	}
	public String getIp_name() {
		return ip_name;
	}
	public void setIp_name(String ip_name) {
		this.ip_name = ip_name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
