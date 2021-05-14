package gfg.recursion;

public class binaryToGrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 0, 1, 1, 1, 0, 1};
		grayCode(String.valueOf(a[0]), a, 1, a.length);
	}

	static void grayCode(String s, int[] a, int curr, int n) {
		if(n == 1) {
			System.out.println(s + " ");
		    return;
		}
		s += String.valueOf(a[curr] ^ a[curr - 1]);
		grayCode(s, a, curr + 1, n - 1);
	}
}
