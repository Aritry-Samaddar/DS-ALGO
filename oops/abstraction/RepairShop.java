package oops.abstraction;

public class RepairShop {
//	public static void repairCar(WagonR car) {
//		System.out.println("Car is repaired");
//	}
//	public static void repairCar(Audi car) {
//		System.out.println("Car is repaired");
//	}
	public static void repairCar(Car car) {
		System.out.println("Car is repaired");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WagonR wagonR = new WagonR(20);
//		Audi audi = new Audi(10);
		
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		wagonR.honk();
		
		repairCar(wagonR);
		repairCar(audi);
	}

}
