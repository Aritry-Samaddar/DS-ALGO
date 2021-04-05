package oops.inheritence;

public class Person {
	
	protected String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("inside person " + name + " constructor");
	}
	
	
//	public void walk() {
//		System.out.println(name + " is walking");
//	}
//	public void eat() {
//		System.out.println(name + " is eating");
//	}
	
	protected void walk() {
		System.out.println("Person " + name + " is walking");
	}
	public void eat() {
		System.out.println("Person " + name + " is eating");
	}
	public static void laughing() {
		System.out.println("Person is laughing");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
