package oops.abstraction;

public abstract class Car {
//	public void accelerate() {
//		
//	}
//	public void breaking() {
//		
//	}
	
//	public Car(int n) {
//		System.out.println("printing " + n);
//	}
	
	public Car() {
		System.out.println("base constructor called");
	}
	
    public abstract void accelerate();
	public abstract void breaking();
	
	public void honk() {
		System.out.println("Car is honking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
