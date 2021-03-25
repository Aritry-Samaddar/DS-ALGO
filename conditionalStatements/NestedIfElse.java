package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
//		int a = 9;
//		int b = 5;
//		int c = 2;
//		if(a > b) {
//			if(a > c) {
//			System.out.println("the max num is: " + a);
//		} else {
//			System.out.println("the max num is: " + c);
//		}
//		
//		} else {
//			if(b > c) {
//				System.out.println("the max num is: " + b);
//			} else {
//				System.out.println("the max num is: " + c);
//			}
//		}
		
//		int a = 9, b = 5, c = 2;
//		int result = 0;
//		if(a > b) {
//			if(a > c) {
//				result = a;
//			} else {
//				result = c;
//			}
//		} else {
//			if(b > c) {
//				result = b;
//			} else {
//				result = c;
//			}
//		}
//		
//		System.out.println("largest of the three numbers is: " + result);
		
		int a = 9, b = 5, c = 2;
		int result = 0;
		result = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println("largest of the three numbers is: " + result);

	}

}
