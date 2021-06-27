package foreignProjects;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			for(int j = 0; j < (n - i) * 2; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			for(int j = 0; j < (n - i) * 2; j++) {
				System.out.print("  ");
			}
			for(int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
