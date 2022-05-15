package Proxy_shop2;
//商品名称阿迪达斯鞋子,商品数量120
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
		if(product.sell(number).equals("出售成功"))
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
					return  "该用户没有权限";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		    return "缺货";
	}
	public boolean validate(String name) throws Exception
	{
	
		AccessValidator vali = new AccessValidator();
		return vali.validate(name);
	}


}
