package oops.packages.models;

public class Student {
	private String name;       // private func or private const can not be accessible by other classes.
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	private String getPassword() {
		return "ari@9";
	}
	
	String roll() {          // default methods will only be accessible to the all classes of this particular package.
		return "36";
	}

	public static void main(String[] args) {
		
		

	}

}
