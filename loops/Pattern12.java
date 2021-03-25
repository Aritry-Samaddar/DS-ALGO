package loops;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 4;
		for(int i = 1; i <= n; i++) {
				if(i > 1) {
					for(int p = 1; p <= result; p++) {
						System.out.print(" ");
					}
					result += 4;
				}
				for(int j = n; j >= i; j--) {
					System.out.print("* ");
				}
				System.out.println();
		
	
		}

	}

}
