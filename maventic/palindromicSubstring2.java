package maventic;

public class palindromicSubstring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "forgeeksskeegfor";
		System.out.println(LongPal(s));
	}
	
	static void print(String s, int start, int end) {
		System.out.println(s.substring(start, end + 1));
	}
	
	static int LongPal(String s) {
		int n = s.length();
		boolean[][] table = new boolean[n][n];
		int maxLength = 1;
		for(int i = 0; i < n; i++) {
			table[i][i] = true;
		}
		int start = 0;
		for(int i = 0; i < n - 1; i++) {
			if(s.charAt(i) == s.charAt(i + 1)) {
				start = i;
				table[i][i + 1] = true;
				maxLength = 2;
			}
		}
		for(int k = 3; k < n; k++) {
			for(int i = 0; i < n - k + 1; i++) {
				int j = i + k - 1;
				if(table[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
					table[i][j] = true;
					if(k > maxLength) {
						start = i;
						maxLength = k;
					}
				}
			}
		}
		print(s, start, start + maxLength - 1);
		return maxLength;
	}
}
