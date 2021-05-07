package gfg.recursion;

public class uppercaseLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geekSgeeKs";
		fun(s, 0);

	}
	
	static void fun(String s, int n) {
		if(n >= s.length()) {
			System.out.println("No uppercase letter");
			return;
		}
		if(s.charAt(n) >= 65 && s.charAt(n) <= 90) {
			System.out.println(s.charAt(n));
			return;
		}
		fun(s, n + 1);
	}

}
