package gfg.recursion;

public class lengthKFromFirstN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ans = new int[3];
		fun(ans, 0, 3, 5, 1);
	}

	static void fun(int[] ans, int index, int k, int n, int i) {
		if(index == k) {
			for(int j = 0; j < k; j++) {
				System.out.print(ans[j]);
			}
			System.out.println();
			return;
		}
		if(i > n) return;
		ans[index] = i;
		fun(ans, index + 1, k, n, i + 1);
		fun(ans, index, k, n, i + 1);
	}
}
