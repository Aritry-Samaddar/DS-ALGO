package loops;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no = 0;
		for(int i = 1; i <= n; i++) {
			int result = 0;
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			
			for(int j = 1; j <= i + no; j++) {
				result++;
				System.out.print(result + " ");
			}
			no++;
			System.out.println();
		}

	}

}
