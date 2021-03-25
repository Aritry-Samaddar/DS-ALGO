package final450.array;

import java.util.*;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		int n = 8;
//		int[] a = {-45, -52, -64, -25, -30};
//		int n = 5;
//		int[] a = {-54, -45, 75, -85, -52, -56, -90, -23};
//		int n = 8;
//		int sum = a[0];
//		int c = 0;
//		for(int i = 1; i < n; i++) {
//			if(a[i] > sum) {
//				sum = a[i];
//			}
//		}
//		for(int i = n - 1; i >= 0; i--) {
//			c = n - i;
//			for(int j = 0; j < i; j++) {
//				int l = j;
//				int k = 0;
//				int x = 0;
//				while(k  <= c) {
//					x += a[l];
//					l++;
//					k++;
//				}
//				if(x > sum) {
//					sum = x;
//				}
//			}
//		}
//		System.out.println(sum);
		
		int max_end = 0;
		int max_far = 0;
		for(int i = 0; i < n; i++) {
			max_end += a[i];
			if(max_end < 0) {
				max_end = 0;
			}
			if(max_end > max_far) {
				max_far = max_end;
			}
		}
		System.out.println(max_far);

	}


}
