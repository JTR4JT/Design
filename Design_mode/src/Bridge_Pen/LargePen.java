package Bridge_Pen;

public class LargePen  extends Pen {

	public LargePen(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print("��ʻ�");
		color.type();
	}

}
