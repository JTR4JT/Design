package Decorator_pattern_coffee;

public abstract class Coffer {
	 double price = 0;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract void show();
}
