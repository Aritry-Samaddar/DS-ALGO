package oops.inheritence;

public class Teacher extends Person {
//	public void teach() {
//		System.out.println(name + " is teaching");
//	}
	public Teacher(String name) {
		super(name);
		System.out.println("inside teacher " + name + " constructor");
	}
	
	public void teach() {
		System.out.println("Teacher " + name + " is teaching");
	}
	public static void laughing() {
		System.out.println("Teacher is laughing");
	}
	public void eat() {
		super.eat();
		System.out.println("Teacher " + name + " is eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
