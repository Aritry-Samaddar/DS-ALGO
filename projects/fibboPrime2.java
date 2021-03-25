package projects;

import java.util.Scanner;

public class fibboPrime2 {

	public static void main(String[] args) {
//		correct one
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int p = 2;
		
		boolean isPrinted = false;
		int count = 0;
		System.out.print(b + " ");
		count += 1;
		while(count < n) {
			int result = 0;
			for(int j = 1; j <= p; j++) {
				if(p % j == 0) {
					result += 1;
				}
			}
			if(result == 2) {
				System.out.print(p + " ");
				count += 1;
				isPrinted = true;
			}
			p++;
			if(isPrinted == true && count < n) {
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
