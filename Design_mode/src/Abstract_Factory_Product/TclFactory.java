package Abstract_Factory_Product;

public class TclFactory extends Factory{

	@Override
	public Tv CreateTv() {
		// TODO Auto-generated method stub
		return new TclTv();
	}

	@Override
	public A_c CreateA_c() {
		// TODO Auto-generated method stub
		return new TclA_c();
	}

}
