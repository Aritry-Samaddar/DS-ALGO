package foreignProjects;

import java.util.*;

public class MickeyMinnie {

//	static ArrayList<String> al = new ArrayList<>();
	static Set<String> al = new HashSet<>();
	static int counts = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = { -2, 5, -1 };
//		int[] arr = { -3, 2, -1 };
//		int[] arr = { -3, 2, -1, 2, -3, 1 };
		int[] arr = { -3, 2, -1, 2, -3, 1, 2, -3, 1, 4, -2 };
		int m = -2;
		int n = 2;
		rec(arr, m, n, 0);
		System.out.println(al);
		System.out.println(al.size());
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum >= m && sum <= n) count++;
			for(int j = i + 1; j < arr.length; j++) {
				sum += arr[j];
				if(sum >= m && sum <= n) count++;
			}
			sum = 0;
		}
		System.out.println(count);
		
		countPairs(arr, 0, arr.length - 1, m, n);
		System.out.println(counts);
	}
	
	static void countPairs(int[] a, int l, int r, int m, int n) {
		if(l > r) return;
		countPairs(a, l + 1, r, m, n);
		merge(a, l, r, m, n);
	}
	
	static void merge(int[] a, int l, int r, int m, int n) {
		int sum = 0;
		for(int i = l; i <= r; i++) {
			sum += a[i];
			if(sum >= m && sum <= n) counts++;
		}
	}

	static void rec(int[] arr, int m, int n, int index) {
		if(index >= arr.length) return;
		for(int i = index; i < arr.length; i++) {
			if(fun(arr, index, i, m, n)) {
				String s = "[" + index + "," + i + "]";
				al.add(s);
			}
			rec(arr, m, n, i + 1);
		}
	}
	
	static boolean fun(int[] arr, int i, int j, int m, int n) {
		int sum = 0;
		for(int k = i; k <= j; k++) {
			sum += arr[k];
		}
		if(sum >= m && sum <= n) return true;
		else return false;
	}
}
