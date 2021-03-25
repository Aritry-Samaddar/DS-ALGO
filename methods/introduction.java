package methods;

public class introduction {

	public static void main(String[] args) {
		
		int firstNumber = 5;
		int secondNumber = 3;
		int result = maxOf(firstNumber, secondNumber);
		System.out.println(result);
		maxOf(100, 200);
		System.out.println(maxOf(6, 10));
		maxOf(2, 4);
		sayHi();
		
		maxOf(5);
	}
	
	static int maxOf(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	static void maxOf(float d) {
		
	}
	
	static void sayHi() {
		System.out.println("Hi");
	}

}
