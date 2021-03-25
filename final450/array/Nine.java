package final450.array;

import java.util.Arrays;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {1, 5, 8, 10};
//		int[] a = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
//		int n = 10;
//		int k = 5;
		int[] a = {6, 1, 9, 1, 1, 7, 9, 5, 2, 10};
		int n = 10;
		int k = 4;
//		for(int i = 0; i < n; i++) {
//			if(a[i] > k) {
//				a[i] -= k;
//			} else {
//				a[i] += k;
//			}
//		}
//		int min = a[0];
//		int max = a[0];
//		for(int i = 1; i < n; i++) {
//			if(a[i] < min) {
//				min = a[i];
//			}
//			if(a[i] > max) {
//				max = a[i];
//			}
//		}
//		System.out.println(max - min);
		
		
		if(n == 1) {
			System.out.println(0);
		}
		Arrays.sort(a);
		int ans = a[n - 1] - a[0];
		int small = a[0] + k;
		int big = a[n - 1] - k;
		int temp = 0;
		if(small > big) {
			temp = small;
			small = big;
			big = temp;
		}
		for(int i = 1; i < n - 1; i++) {
			int substract = a[i] - k;
			int add = a[i] + k;
			if(substract >= small || add <= big) {
				continue;
			}
			if(big - substract <= add - small) {
				small = substract;
			} else {
				big = add;
			}
		}
		System.out.println(Math.min(ans, big - small));

	}

}
