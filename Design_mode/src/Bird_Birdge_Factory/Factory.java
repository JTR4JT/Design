package Bird_Birdge_Factory;

public class Factory {
	public static Bird create(int number) {
		Bird bird = null;
		if (number == 1)
			bird = new Pigeon();
		if (number == 2)
			bird = new Eagle();
		if (number == 3)
			bird = new Penguin();
		return bird;
	}
}
