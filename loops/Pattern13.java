package loops;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rows = 2 * n - 1;
		int result = 1;
		int result2 = n - 1;
		for(int i = 1; i <= rows; i++) {
			if(i <= n) {
				for(int j = 1; j <= n - i; j++) {
					System.out.print("  ");
				}
				for(int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
			} else {
				
				for(int j = 1; j <= result; j++) {
					System.out.print("  ");
				}
				result++;
				for(int j = 1; j <= result2; j++) {
					System.out.print("* ");
				}
				result2--;
				
			}
			System.out.println();
		}

	}

}
