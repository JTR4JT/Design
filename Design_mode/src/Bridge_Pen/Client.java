package Bridge_Pen;

public class Client {
	public static void main(String[] args) {
		Pen pen =new LargePen(new Red());
		pen.draw();
		Pen pen2=new MiddlePen(new Black());
		pen2.draw();
	}

}
