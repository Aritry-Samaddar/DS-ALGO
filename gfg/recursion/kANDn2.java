package gfg.recursion;

public class kANDn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun("12345", 5, 3, 0, "");
	}

	static void fun(String s, int n, int k, int index, String ans) {
		if(ans.length() == k) {
			System.out.println(ans);
			return;
		}
		if(index >= n) return;
		for(int i = index; i < n; i++) {
			ans += s.charAt(i);
			fun(s, n, k, i + 1, ans);
			ans = ans.substring(0, ans.length() - 1);
		}
	}
}
