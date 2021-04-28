package gfg.recursion;

public class StrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dad";
		String ans = strPal(s, s.length());
		if(s.equals(ans)) {
			System.out.println("palindrome");
		} else {
			System.out.println("!palindrome");
		}

	}
	
	static String strPal(String s, int n) {
		if(n == 1) return String.valueOf(s.charAt(0));
		return s.charAt(n - 1) + strPal(s, n - 1);
	}

}
