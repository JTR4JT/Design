package Decorator_pattern_VisualComponent;

public class Client {
	
	public static void main(String[] args) {
		Component component,componentSB,componentBB;
		component = new Window();
		componentSB = new ScrollBarDecorator(component);
		componentBB = new BlackBorderDecorator(componentSB);
		componentBB.display();
	}
	
}
