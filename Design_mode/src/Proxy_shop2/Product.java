package Proxy_shop2;

public class Product implements ShopSystem {

	String name="�ز�";
	int num=100;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public  String sell(int number) {
		// TODO Auto-generated method stub
		if(number>num)
			return "��Ʒ��治��";
		else return "���۳ɹ�"; 
	}


}
