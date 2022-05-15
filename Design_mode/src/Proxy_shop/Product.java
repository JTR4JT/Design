package Proxy_shop;

public class Product implements ShopSystem {

	String name="特步";
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
			return "商品库存不足";
		else return "出售成功"; 
	}


}
