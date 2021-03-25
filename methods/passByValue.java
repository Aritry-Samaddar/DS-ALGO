package methods;

public class passByValue {

	public static void main(String[] args) {
		
//		int c = 32;
//		int d = 42;
//		swap(c,d);
//		System.out.println(c + " " + d);
		
		Dog c = new Dog();
		c.legs = 3;
		Dog d = new Dog();
		d.legs = 4;
		swap(c, d);
		System.out.println(c.legs + " " + d.legs);
		
		Dog a = new Dog();
		a.legs = 4;
		changeDog(a);
		System.out.println(a.legs);
		
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	static void swap(Dog a, Dog b) {
		Dog temp = a;
		a = b;
		b =  temp;
	}
	
	static void changeDog(Dog dog) {
		dog.legs  = 6;
	}

}
class Dog{
	int legs;
}