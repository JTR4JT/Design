package Proxy_shop3;

public class Product implements ShopSystem {
	Order order = new Order();
	String name = "�ز�";
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
			return "��Ʒ��治��";
		else
			return "�����Ʒ" + name + number + "���ɹ�";
	}

	@Override
	public void change(Order order, User user, int num) {
		// TODO Auto-generated method stub
		if (user.name.equals("��ɽ")) {
			System.out.println("ԭʼ��������Ϊ" + order.productNum);
			if (num > this.num)
				System.out.println("��Ʒ��治��");
			else {
				order.productNum = num;
				System.out.println("������������Ϊ" + order.productNum);
			}

		} else {
			System.out.println(user.name + "û���޸ĵ�Ȩ��");
		}
	}

}
