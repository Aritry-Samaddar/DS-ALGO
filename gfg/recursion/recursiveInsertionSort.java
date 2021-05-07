package gfg.recursion;

import java.util.Arrays;

public class recursiveInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5, 4, 10, 1, 6, 2};
		insertion(a, 1);
		System.out.println(Arrays.toString(a));

	}

	static void insertion(int[] a, int n) {
		if(n >= a.length) return;
		int temp = a[n];
		int j = n - 1;
		while(j >= 0 && a[j] > temp) {
			a[j + 1] = a[j];
			j--;
		}
		a[j + 1] = temp;
		insertion(a, n + 1);
	}
}
