package loops;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int count = 0;
		System.out.print(a + " ");
		count += 1;
		System.out.print(b + " ");  //'print' function prints the output in the same line;
		count += 1;                           //'println' function prints the output in orderly different lines;
		
//		for(int i = 0; i < n - 2; i++) { //n-2 because 2 nos. from n number, we printed earlier;
		while(count < n) {
			
		
			int c = a + b;
			System.out.print(c + " ");
			count += 1;
			a = b;
			b = c;
		}	
//		}

	}

}
