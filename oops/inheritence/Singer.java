package oops.inheritence;

public class Singer extends Person {
//	public void sing() {
//		System.out.println(name + " is singing");
//	}
	
	public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void sing() {
		System.out.println("Singer " + name + " is singing");
	}
	public static void laughing() {
		System.out.println("Singer is laughing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
