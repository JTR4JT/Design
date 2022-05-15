package Decorator_pattern_coffee;

public  class ComponentDecorator extends Coffer {

	 Coffer coffer;
	public ComponentDecorator(Coffer coffer) {
		// TODO Auto-generated constructor stub
		this.coffer=coffer;
	}
	@Override
	public  void show() {
		coffer.show();
	}

}
