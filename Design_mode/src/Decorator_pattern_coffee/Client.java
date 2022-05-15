package Decorator_pattern_coffee;

public class Client {
public static void main(String[] args) {
	Coffer coffer,add;
	double price;
	coffer=new BlueCoffee();
//	coffer.show();
//	System.out.println(coffer.getPrice());
	add=new Milk(coffer);
	add.show();
	System.out.println("价格为:"+coffer.getPrice());
	coffer=new NatieCoffee();
	add=new Orange(coffer);
	add.show();
	System.out.println("价格为:"+coffer.getPrice());
	coffer=new BlueCoffee();
	add=new Milk(coffer);
	add.show();
	add=new Orange(coffer);
	add.show();
	System.out.println("价格为:"+coffer.getPrice());
}
}
