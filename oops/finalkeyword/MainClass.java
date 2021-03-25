package oops.finalkeyword;

public class MainClass extends Student {   // if we make the Student class final then we can not extend that Student class to MainClass
	
//	public void getDescription() {                 // can not override the final method
//		System.out.println("Inside main class");
//	}
	
	
	
	//final int rollNo;        // a final variable must be initialized otherwise compiler will show compile time error(local or any other variables must always be initialized no matter final or normal)
	final int rollNo = 36;     // a final variable can only be initialized once
	final int ROLL_NO = 50;  // it's a convension to be followed that it's a good practice to name final variable in all caps and seperated by _

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int roll;
		final String name = "Aritry";
		//name ="Samaddar";     // a final local variable can't be assigned
		
		
		
		final Student obj = new Student();
		Student obj2 = new Student();
//		obj = obj2;   // a final local variable object can not be assigned means we can't change the reference of final object
		obj.namee = "Aritry";  // but we can change the final object's values or/ internal state of the object pointed by that reference variable can be changed
		
		
		
		MainClass obj3 = new MainClass();
			obj3.getDescription();

	}

}
