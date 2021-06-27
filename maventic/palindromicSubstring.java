package maventic;

public class palindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "forgeeksskeegforeeksskee";
		LongPal(s);
	}

	static void Print(String s, int i, int j) {
		for(int k = i; k <= j; k++) {
			System.out.print(s.charAt(k));
		}
	}
	
	static void LongPal(String s) {
		int l, h;
		int start = 0, end = 1;
		for(int i = 1; i < s.length(); i++) {
			// even substring
			l = i - 1;
			h = i;
			while(l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
				if(h - l + 1 > end) {
					start = l;
					end = h - l + 1;
				}
				l--;
				h++;
			}
			
			// odd substring
			l = i - 1;
			h = i + 1;
			while(l >= 0 && h < s.length() && s.charAt(l) == s.charAt(h)) {
				if(h - l + 1 > end) {
					start = l;
					end = h - l + 1;
				}
				l--;
				h++;
			}
		}
		
		Print(s, start, start + end - 1);
	}
}
