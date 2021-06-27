package oops.abstraction;

public class WagonR extends Car {
//	public WagonR(int n) {
//		super(n);
//		// TODO Auto-generated constructor stub
//	    System.out.println("constructor is called");
//	}
	@Override
	public void accelerate() {
		System.out.println("WagnoR is accelerating");
	}
	public void breaking() {
		System.out.println("WagnoR is breaking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
