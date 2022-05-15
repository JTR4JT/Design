package Proxy_shop2;
//��Ʒ���ư��ϴ�˹Ь��,��Ʒ����120
public class Proxy implements ShopSystem{

	private Product product;
	private Order order=new Order();
	private User user ;
	public Proxy(Product product,String name) {
		// TODO Auto-generated constructor stub
		this.product=product;
		this.user=new User(name);
	}
	@Override
	public String sell(int number) {
		if(product.sell(number).equals("���۳ɹ�"))
		{
			order.productName=product.name;
			order.productNum=number;
			try {
				if(this.validate(user.name))
				{
					order.customerName=user.name;
					return order.toString();
				}
				else 
				{
					return  "���û�û��Ȩ��";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		    return "ȱ��";
	}
	public boolean validate(String name) throws Exception
	{
	
		AccessValidator vali = new AccessValidator();
		return vali.validate(name);
	}


}
