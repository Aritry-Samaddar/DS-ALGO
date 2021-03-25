package projects;

import java.util.Scanner;

public class candy {

	public static void main(String[] args) {
		
		int n = 10;
		int k = 5;
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		if(p <= n - k  && p > 0) {
			n -= p;
			System.out.println("NUMBER OF CANDIES SOLD : " + p);
			System.out.println("NUMBER OF CANDIES AVAILABLE : " + n);
		} else {
			System.out.println("INVALID INPUT");
			System.out.println("NUMBER OF CANDIES LEFT : " + n);
		}

	}

}
