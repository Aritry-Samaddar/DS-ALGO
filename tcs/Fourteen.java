package tcs;

import java.util.Scanner;

public class Fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		a[0] = 1;
		a[1] = 2;
		a[2] = 1;
		int b = 1;
		int c = 2;
		int d = 1;
		for(int i = 3; i < n; i++) {
			if(i % 2 != 0) {
				int f = c;
				while(f >= 2) {
					f++;
					boolean is = true;
					for(int j = 2; j < f; j++) {
						if(f % j == 0)
						is = false;
						break;
					}
					if(is == true) {
						a[i] = f;
						break;
					}
				}
				c = f;
			} else if(i % 2 == 0) {
				a[i] = b + d;
				b = d;
				d = a[i];
			}
		}
		System.out.println(a[n - 1]);

	}

}
