package oops.finalkeyword;

//public final class Student
public class Student {
	
	int roll;
	String namee;
	
//	public void getDescription() {
//		System.out.println("The student name is : " + name);
//	}
	
	public final void getDescription() {
		System.out.println("The student name is : " + name);
	}
	
	
	
	final int rollNo;     // blank final variable
	//final static String name;
	final String name;
	
	{
		rollNo = 36;
	}
	
//	static {
//		name = "Aritry";
//	}
	
	public Student() {
		name = "Aritry";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
