package tcs;

import java.util.Scanner;

public class Ten {
	public void verify(int n) {
		if(n < 0) {
			System.out.println("Please enter positive number!!");
		} else if(n >= 0) {
			cal(n);
		}
	}
	public void cal(int n) {
		boolean isPrime = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(n < 2) isPrime = false;
		if(isPrime == true) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not prime number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Ten obj = new Ten();
		obj.verify(n);

	}

}
