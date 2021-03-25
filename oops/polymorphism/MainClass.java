package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog d = new Dog();
//		Pet p = d;
//		Animal a = d;
//		
//		d.walk(); // run time polymorphism (we know which method will be called during run time)/late binding/dynamic binding
//		p.walk();           // methods can be override
		//a.walk();
		
		Dog d = new Dog();
		Pet p = d;
		
		System.out.println(d.name);
		System.out.println(p.name);  // variables can not be override
		
		greetings();
		greetings("Good Morning");
		greetings("Hello", 5);

	}
	public static void greetings() {        // compile time polymorphism (we know which method will be called during compile time)/early binding/static binding
		System.out.println("Hi, There");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}
	public static void greetings(String s, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(s);
		}
	}

}
