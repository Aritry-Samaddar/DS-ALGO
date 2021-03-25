package projects;

import java.util.Scanner;

public class Prime3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String primeNumbers = "";
		for(int j = 1; j <= n; j++) {
			int result = 0;
			for(int i = j; i >= 1; i--) {
				if(j % i == 0) {
					result = result + 1;
				}
			}
			if(result == 2) {
				primeNumbers = primeNumbers + j + " ";
			}
			
		}
		System.out.println(primeNumbers);

	}

}
