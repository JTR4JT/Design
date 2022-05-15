package Proxy_shop3;

public class Product implements ShopSystem {
	Order order = new Order();
	String name = "特步";
	int num = 500;

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
	public String sell(int number) {
		// TODO Auto-generated method stub
		if (number > num)
			return "商品库存不足";
		else
			return "购买产品" + name + number + "件成功";
	}

	@Override
	public void change(Order order, User user, int num) {
		// TODO Auto-generated method stub
		if (user.name.equals("张山")) {
			System.out.println("原始订单数量为" + order.productNum);
			if (num > this.num)
				System.out.println("商品库存不足");
			else {
				order.productNum = num;
				System.out.println("将订单数量改为" + order.productNum);
			}

		} else {
			System.out.println(user.name + "没有修改的权限");
		}
	}

}
