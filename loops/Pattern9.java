package loops;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		for(int i = 1; i <= n; i++) {
			if(i == 1 || i == n) {
				for(int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
			} else {
				System.out.print("*");
				
				for(int j = 1; j <= result; j++) {
					System.out.print(" ");
					
				}
				result += 2;
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
			
		

	}

}


