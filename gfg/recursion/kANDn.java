package gfg.recursion;

public class kANDn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] output = new int[3];
		fun(output, 7, 3, 0, 1);

	}

	static void fun(int[] output, int n, int k, int i, int start) {
		if(i == k) {
			for(int j = 0; j < k; j++) {
				System.out.print(output[j] + " ");
			}
			System.out.println();
			return;
		}
		for(int j = start; j <= n; j++) {
			output[i] = j;
			fun(output, n, k, i + 1, j + 1);
		}
	}
}
