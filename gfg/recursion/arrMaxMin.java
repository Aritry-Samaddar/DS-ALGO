package gfg.recursion;

public class arrMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, 1234, 45, 67, 1};
		System.out.println(getMin(a, a.length, 0));
		System.out.println(getMax(a, a.length, 0));
		

	}
	
	static int getMin(int[] a, int n, int i) {
		if(n == 1) return a[i];
		return Math.min(a[i], getMin(a, n - 1, i + 1));
	}

	static int getMax(int[] a, int n, int i) {
		return (n == 1) ? a[i] : Math.max(a[i], getMax(a, n - 1, i + 1));
	}
}
