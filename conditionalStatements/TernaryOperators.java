package conditionalStatements;

public class TernaryOperators {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int maxOfBothNumbers = 0;
//		if(a > b) {
//			System.out.println(maxOfBothNumbers = a);
//		} else {
//			System.out.println(maxOfBothNumbers = b);
//		}
		
		maxOfBothNumbers = (a > b) ? a : b;
		System.out.println("Max of both numbers is: " + maxOfBothNumbers);

	}

}
