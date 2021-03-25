package whileLoops;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n < 0) {
			n = -(n);
		}
		
		int numOfDigits = (int)Math.log10(n) + 1;
		System.out.println(numOfDigits);

	}

}
