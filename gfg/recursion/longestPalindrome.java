package gfg.recursion;

public class longestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "forgeeksskeegforeeksskee";
		String result = longPal(s, 0, 1, "", "");
		System.out.println(result);

	}
	
	static String longPal(String s, int l, int r, String len, String ans) {
		if(l < 0 || r >= s.length()) {
			return len;
		}
		
		if(s.charAt(l) == s.charAt(r)) {
			return longPal(s, l - 1, r + 1, len, s.substring(l, r + 1));
		} else {
			if(len.length() < ans.length()) {
				len = ans;
			}
			return longPal(s, r, r + 1, len, ans);
		}
	}

}
