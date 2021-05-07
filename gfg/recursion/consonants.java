package gfg.recursion;

public class consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks portal";
		int ans = totalConsonants(s, s.length());
		System.out.println(ans);

	}
	
//	static int find(String s, int index, int ans) {
//		if(index >= s.length()) return ans;
//		if(s.charAt(index) != 'a' && s.charAt(index) != 'e' && s.charAt(index) != 'i' && s.charAt(index) != 'o' && s.charAt(index) != 'u' && s.charAt(index) != ' ') {
//			ans++;
//		}
//		return find(s, index + 1, ans);
//	}
	
	static boolean isConsonant(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') == false && ch >= 65 && ch <= 90;
	}

	static int totalConsonants(String s, int n) {
		if(n == 1) {
			if(isConsonant(s.charAt(0))) return 1;
			else return 0;
		}
		if(isConsonant(s.charAt(n - 1))) return totalConsonants(s, n - 1) + 1;
		else return totalConsonants(s, n - 1);
	}
}
