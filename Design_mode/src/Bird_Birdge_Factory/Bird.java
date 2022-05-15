package Bird_Birdge_Factory;

public abstract class Bird {

	Behavoir fly;
	Behavoir swim;

	public Behavoir getFly() {
		return fly;
	}

	public void setFly(Behavoir fly) {
		this.fly = fly;
	}

	public Behavoir getSwim() {
		return swim;
	}

	public void setSwim(Behavoir swim) {
		this.swim = swim;
	}

	public abstract void show();
}
