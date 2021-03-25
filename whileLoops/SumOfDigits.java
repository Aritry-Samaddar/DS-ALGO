package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(temp > 0) {
			int lastNumber = temp % 10;
			temp /= 10;
			sum += lastNumber;
		}
		System.out.println("The sum of digits of " + n + " is : " + sum);

	}

}
