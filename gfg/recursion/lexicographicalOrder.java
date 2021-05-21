package gfg.recursion;

public class lexicographicalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i < 10; i++) {
			dfs(i, 10000);
		}
	}

	static void dfs(int i, int n) {
		if(i > n) return;
		System.out.println(i);
		for(int j = 0; j < 10; j++) {
			dfs(10 * i + j, n);
		}
	}
}
