package loops;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = 2;
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for(int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			space += 2;
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			space -= 2;
			for(int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
