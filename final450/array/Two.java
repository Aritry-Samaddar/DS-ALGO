package final450.array;

import java.util.Arrays;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 1, 5, 7, 10, 50, 0};
		int n = a.length;
		Arrays.sort(a);
		System.out.println("The min no is : " + a[0]);
		System.out.println("The max no is : " + a[n - 1]);

	}

}
