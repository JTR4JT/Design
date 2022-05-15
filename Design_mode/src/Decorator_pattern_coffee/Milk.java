package Decorator_pattern_coffee;

public class Milk extends ComponentDecorator {

	public Milk(Coffer coffer) {
		super(coffer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.addMilk();
		this.setPrice();
		super.show();
	}
	public void addMilk()
	{
		System.out.print("╪сакеёдл");
	}
	public void setPrice()
	{
		coffer.price+=2;
	}

}
