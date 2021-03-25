package oops;

class vehicle {
	int wheels;
	int headLights;
	String color;
//	vehicle() {
//		wheels = 4;
//	}
//	vehicle(int noOfWheels){
//		wheels = noOfWheels;
//	}
	vehicle(){
		System.out.println("This is the new vehicle.");
	}
	vehicle(int wheels){
		this.wheels = wheels;
		headLights = 2;
	}
	vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}
public class constructor {
	constructor() {
		System.out.println("Object is now created.");
	}

	public static void main(String[] args) {
		
//		constructor obj = new constructor();
//		vehicle car = new vehicle();
//		vehicle car2 = new vehicle();
//		System.out.println(car.wheels + " wheels.");
//		System.out.println(car2.wheels + " wheels.");
		vehicle car = new vehicle(4);
		vehicle scooty = new vehicle(2);
		
		vehicle taxy = new vehicle(4, "Yellow");
		vehicle random = new vehicle();
		
		System.out.println(car.wheels + " wheels.");
		System.out.println(scooty.wheels + " wheels.");
		
		System.out.println(taxy.wheels + " wheels and color = " + taxy.color);

	}

}
