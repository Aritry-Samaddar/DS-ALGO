package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				result += 1;
			}
		}
		if(result == 2){
			System.out.println("It's a prime number!");
		} else {
			System.out.println("It's not a prime number!");
		}

	}

}
