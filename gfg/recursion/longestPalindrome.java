package gfg.recursion;

public class longestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "forgeeksskeegforeeksskee";
		String s = "ggtgg";
		String result = longPal(s, 0, 1, "", "");
		System.out.println(result);

	}
	
	static String longPal(String s, int l, int r, String len, String ans) {
		if(len.length() < ans.length()) {
			len = ans;
		}
		if(l < 0 && r >= s.length()) {
			return len;
		}
		
		if(l < 0) {
			l++;
		}
		if(r >= s.length()) {
			r--;
		}
		
		if(s.charAt(l) == s.charAt(r)) {
			return longPal(s, l - 1, r + 1, len, s.substring(l, r + 1));
		} else if(s.length() % 2 == 0) {
			return longPal(s, r, r + 1, len, ans);
		} else {
			return longPal(s, r, r + 2, len, ans);
		}
	}

}
