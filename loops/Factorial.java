package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int result = 1;
		for(int i = n; i >= 1; i--) {
			result = result * i;
		}
		System.out.println("The factorial is: " + result);

	}

}
