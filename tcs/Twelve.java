package tcs;

import java.util.Scanner;

public class Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int b = 1;
		int c = 1;
		a[0] = 1;
		a[1] = 1;
		for(int i = 2; i < n; i++) {
			if(i % 2 == 0) {
				b *= 2;
				a[i] = b;
			} else if(i % 2 != 0) {
				c *= 3;
				a[i] = c;
			}
		}
		System.out.println(a[n - 1]);

	}

}
