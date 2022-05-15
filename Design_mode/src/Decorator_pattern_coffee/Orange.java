package Decorator_pattern_coffee;

public class Orange extends ComponentDecorator{

	public Orange(Coffer coffer) {
		super(coffer);
		// TODO Auto-generated constructor stub
	}
	public void show() {
		// TODO Auto-generated method stub
		this.addOrange();
		this.setPrice();
		super.show();
	}
	public void addOrange()
	{
		System.out.print("º”¡À≥»÷≠");
	}
	public void setPrice()
	{
		coffer.price+=3;
	}

}
