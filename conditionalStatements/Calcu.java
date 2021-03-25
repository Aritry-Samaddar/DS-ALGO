package conditionalStatements;

import java.util.Scanner;

public class Calcu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		System.out.println("Enter the operation:");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		switch(operation) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			System.out.println("Invalid Operation.");
		}
		System.out.println("The result is: " + result);
		
		
		
		int result2 = result;
		for(int i = 0; ; i++) { //for(int i = 0; i < 10; )/for(int i = 0; i < 10; i--)/for(int i = 0; i < 10; )/for( ; ; )/infinite for loop;
			System.out.println("Enter the number: ");
			int c = sc.nextInt();
			System.out.println("Enter the operation:");
			sc.nextLine();
			char operation2 = sc.nextLine().charAt(0);
			
			switch(operation2) {
			case '+':
				result2 = result2 + c;
				break;
			case '-':
				result2 = result2 - c;
				break;
			case '*':
				result2 = result2 * c;
				break;
			case '/':
				result2 = result2 / c;
				break;
			default:
				System.out.println("Invalid Operation.");
			}
			System.out.println("The result is: " + result2);
			
		}

	}

}
