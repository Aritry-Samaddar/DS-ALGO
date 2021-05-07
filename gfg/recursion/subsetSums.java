package gfg.recursion;

import java.util.*;

public class subsetSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5, 2, 1};
		ArrayList<Integer> al = new ArrayList<>();
		sum(a, a.length, 0, al, 0);
		Collections.sort(al);
		System.out.println(al);
		for(int e : al) {
			System.out.print(e + " ");
		}
		
	}

	static void sum(int[] a, int n, int i, ArrayList<Integer> al, int sum) {
		if(i >= n) return;
		if(sum == 0)
		    al.add(sum);
		for(int j = i; j < n; j++) {
			sum += a[j];
			al.add(sum);
			sum(a, n, j + 1, al, sum);
			sum -= a[j];
		}
	}
}
