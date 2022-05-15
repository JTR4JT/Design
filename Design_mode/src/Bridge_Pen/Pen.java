package Bridge_Pen;

public abstract class Pen {
	public Color color;
	public Pen(Color color) {
		// TODO Auto-generated constructor stub
		this.color=color;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public abstract void draw(); 
}
