package Bridge_Pen;

public class MiddlePen extends Pen{

	public MiddlePen(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("ÖÐ±Ê»­");
		color.type();
	}

}
