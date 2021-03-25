package oops.interfaces;

public class Person implements Student, YouTuber { // when a class implements interfaces, then it must also override the methos of that interfaces

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
		YouTuber obj2 = obj;  //upcasting
		obj2.editVideo();
		obj2.makeVideo();
		//obj2.study();  //can't because it's not the functionality of a youtuber

	}
	// interface helps us to get the functionality of multiple inheritance in java

	@Override            // similar to abstract classes, interface helps us to achieve abstraction in java like method override
	public void makeVideo() {
		System.out.println("Person is making good videos");
		
	}

	@Override
	public void study() {
		System.out.println("Person is studying");
		
	}
	@Override
	public void editVideo() {
		System.out.println("Youtuber is editing");
		
	}
	
	public void uploadVideo() {     // if we make default methods in multiple interfaces with same signature then Person class has to implement the methods here otherwise will get error
		
	}

}
//inheritance new in java8.0 is static methods static variable with pros and cons