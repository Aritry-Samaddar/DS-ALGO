package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		double y = sc.nextDouble();
//		System.out.println(x);
//		String hello = sc.nextLine();
//		System.out.println(hello);
		
//		int principal = 5000;
//		float rate = 12.5f;
//		int time = 12;
		
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleInterest = principal * rate * time / 100;
		
		System.out.println("The simple interest is " + simpleInterest);
		

	}

}
