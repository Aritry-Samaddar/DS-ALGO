package gfg.recursion;

public class allPalindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "forgeeksskeegfor";
//		longPal(s, 0, 1, 2, "", "");
//		longPal(s, 0, "", "");
		for(int i = 0; i < s.length(); i++) {
			longPal(s.substring(i, s.length()), 0, "", "");
		}

	}
	
//	static void longPal(String s, int l, int n, int r, String len, String ans) {
//		System.out.print(ans + " ");
//		ans = "";
//		if(r >= s.length()) return;
//		
////		longPal(s, l + 1, n + 1, r + 1, len, String.valueOf(s.charAt(l)));
////		System.out.println();
////		if(s.charAt(l) == s.charAt(n)) {
////			longPal(s, l + 1, n + 1, r + 1, len, s.substring(l, n + 1));
////		}
////		System.out.println();
//		if(s.charAt(l) == s.charAt(r)) {
//			longPal(s, l - 1, n, r + 1, len, s.substring(l, r + 1));
//		} else {
//			longPal(s, l + 1, n + 1, r + 1, len, ans);
//		}
////		System.out.println();
//	}
	
	static void longPal(String s, int n, String len, String ans) {
		if(ans != "")		
		    System.out.println(ans + " ");
		ans = "";
		if(n >= s.length()) return;
		
		len += s.substring(n, n + 1);
		if(len.equals(strPal(len, len.length()))) {
			ans = len;
		}
		longPal(s, n + 1, len, ans);
		
//		for(int i = n; i < s.length(); i++) {
//			len += String.valueOf(s.charAt(i));
//			if(len.equals(strPal(len, len.length()))) {
//				ans = len;
//			}
//			longPal(s, i + 1, len, ans);
//			len = "";
//		}
	}

	static String strPal(String s, int n) {
		if(n == 1) return String.valueOf(s.charAt(0));
		return s.charAt(n - 1) + strPal(s, n - 1);
	}
}
