package tcs;

import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b = 0;
		int c = 0;
		a[0] = 0;
		a[1] = 0;
		for(int i = 2; i < n; i++) {
			if(i % 2 == 0) {
				b += 7;
				a[i] = b;
			} else if(i % 2 != 0) {
				c += 6;
				a[i] = c;
			}
		}
		System.out.println(a[n - 1]);

	}

}
