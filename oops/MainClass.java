package oops;

class cat {
	boolean hasFur;
	String color, breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("Cat is walking.");
	}
	public void eat() {
		System.out.println("Cat is eating.");
	}
	public void description() {
		System.out.println("My cat has " + legs + " legs and " + eyes + " eyes.");
	}
}
class dog {
	String breed, name;
	
	public void jump() {
		System.out.println("My dog " + name + " jumped.");
	}
	public void description() {
		System.out.println("My dog's name is " + name + " and it's breed is " + breed + " breed.");
	}
}



public class MainClass {

	public static void main(String[] args) {
		
//		cat cat1 = new cat();
//		cat cat2 = new cat();
//		
//		cat1.walk();
//		cat2.eat();
//		
//		cat1.legs = 4;
//		cat1.eyes = 2;
//		cat2.legs = 3;
//		cat2.eyes = 1;
//		
//		cat1.description();
//		cat2.description();
		
		dog husky = new dog();
		dog poodle = new dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
		
		poodle.breed = "Poodle";
		poodle.name = "Pooky";
		
		husky.jump();
		husky.description();
		poodle.jump();
		poodle.description();

	}

}
