package Bridge_Pen;

public class SmallPen  extends Pen{

	public SmallPen(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("Ð¡±Ê»­");
		color.type();
	}

}
