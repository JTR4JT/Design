package Proxy_shop;
//商品名称阿迪达斯鞋子,商品数量120
public class Proxy implements ShopSystem{

	private Product product;
	private Order order=new Order();
	private User user ;
	private Select_infornmation infornmation =new Select_infornmation();;
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
		else
			System.out.println("出售失败");
		
		
		return order.toString();
	}
	public boolean validate(String name) throws Exception
	{
	
		return infornmation.selete_user_name(user.name);
//		vali=new AccessValidator();
//		return vali.validate(name);
	}
	public boolean validate_product(String name)
	{
		
		return false;
		
	}
	public boolean validate_order(String name) throws Exception
	{

			return infornmation.selete_order(name);
	
		
		
	}

}
