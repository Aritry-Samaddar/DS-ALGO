package loops;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no = 0;
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			
			for(int j = 1; j <= i + no; j++) {
				if(j == 1 || j == i + no) {
					System.out.print(i + " ");
				} else {
					System.out.print("0 ");
				}
			}
			no++;
			System.out.println();
		}

	}

}
