package Abstract_Factory_Product;

public class Hairfactory extends Factory {

	@Override
	public Tv CreateTv() {
		// TODO Auto-generated method stub
		return new HairTv();
	}

	@Override
	public A_c CreateA_c() {
		// TODO Auto-generated method stub
		return new HairA_c();
	}

}
