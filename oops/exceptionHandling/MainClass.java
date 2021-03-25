package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
////			int a = 5;
////			int b = 0;
////			int c = a / b;
////			System.out.println(c);
//			int[] a = new int[5];
//			System.out.println(a[5]);
//		} catch(ArithmeticException e) {           // catch(Exception e) shouldn't do this cz it doesn't specify the main exception bcz exception is the main cls extended by different classes
//			System.out.println(e.getMessage() + "occured, please check your code.");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Index should be in the size of 0 to size of array.");
//		}catch(IllegalArgumentException e) {
//			System.out.println("Check your casting carefully.");
//		} finally {
//			System.out.println("Sorry for the inconvenience!");
//		}
//		
//		System.out.println("Very important code");
//		System.out.println("Need to run");
//		
//		
//		func1();
//
		func1();
	}
	
//	static void func1() {
//		int a = 5;
//		int b = 0;
//		int c = a / b;
//		System.out.println(c);
//	}
	
	static void func1() {
		int a = 5;
		int b = 3;
		int c = a / b;
		System.out.println(c);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after delay");
//		try {
//			func2();
//		} catch(Exception e) {
//			System.out.println(e.getMessage() + " occured");
//		}
//		boolean isDanger = true;
//		if(isDanger) {
//			throw new ArrayIndexOutOfBoundsException("Danger was coming.");
//		}
	}
	
	static void func2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming.");
		}
	}

}
