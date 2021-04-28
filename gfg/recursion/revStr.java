package gfg.recursion;

public class revStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "adity";
		String ans = reverseStr(s, s.length());
		System.out.println(ans);

	}
	
	static String reverseStr(String s, int n) {
		if(n == 1) return String.valueOf(s.charAt(0));
		return s.charAt(n - 1) + reverseStr(s, n - 1);
	}

}
