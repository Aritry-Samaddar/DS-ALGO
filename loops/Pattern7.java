package loops;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			
			for(int j = 1; j <= i; j++) {
				result += 1;
				System.out.print(result + "   ");
			}
			System.out.println();
		}
		

	}

}
