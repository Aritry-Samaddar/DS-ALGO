package projects;

import java.util.Scanner;

public class fibboPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 2;
		int a = 0;
		int b = 1;
		int count = 0;
		boolean isPrinted = false;
		System.out.print(a + " ");
		count += 1;
		while(count < n) {                              
			int result = 0;
			for(int i = 1; i <= p; i++) {
				if(p % i == 0 ) {
					result += 1;
				}
			}
			if(result == 2) {
				System.out.print(p + " ");
				count += 1;
				if(p == 2) {
					System.out.print(b + " ");
					count += 1;
				}
				if(p >= 3 && result == 2) {
					isPrinted = true;
				}
			}
			p++;
			if(isPrinted == true) {
				int c = a + b;
				System.out.print(c + " ");
				count += 1;
				a = b;
				b = c;
			}
			isPrinted = false;
		}
		

	}

}
