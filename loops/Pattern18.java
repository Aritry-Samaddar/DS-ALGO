package loops;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no = 1;
		for(int i = 1; i <= n; i++) {
			for(int p = 1; p <= n - i; p++) {
				System.out.print("  ");
			}
			
				if(i == 1 || i == n) {
					for(int p = 1; p <= i; p++) {
					System.out.print("* ");
					}
				} else {
			    	
				    System.out.print("* ");
				    if(i > 2) {
				    for(int p = 1; p <= no; p++) {
					    System.out.print("  ");
				    }
				    no++;
				    }
				    System.out.print("* ");
			    }
				
			System.out.println();
			
		}

	}

}
