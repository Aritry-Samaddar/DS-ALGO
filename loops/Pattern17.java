package loops;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no = n + 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
				if(i >= 2) {
					int result = no - i;
					
					for(int p = 1; p <= i - 1; p++) {
						System.out.print(result + " ");
						if(i > 2)
							result++;
					}

				}
				
			System.out.print("0 ");
			if(i >= 2) {
				int result = n - 1;
				
				for(int p = 1; p <= i - 1; p++) {
					System.out.print(result + " ");
					if(i > 2)
						result--;
				}

			}
			System.out.println();
			}
			
		
		}

	}

