package loops;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no = 2;
		int no1 = 1;
		for(int i = 1; i <= n; i++) {
			for(int p = 1; p <= n - i; p++) {
				System.out.print("  ");
			}
			if(i == 1) {
				System.out.print("1 ");
				System.out.print("  ");
			} else {
				System.out.print("1 ");
				System.out.print("  ");
				if(i > 2) {
					for(int p = 1; p <= no1; p++) {
						
						System.out.print(no);
						System.out.print("   ");
					}
					no++;
					no1++;
				}
				System.out.print("1 ");
				System.out.print("  ");
			}
		System.out.println();
		}

	}

}
