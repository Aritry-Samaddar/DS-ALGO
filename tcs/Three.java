package tcs;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcddfffttttee";
		int sum = 0;
		char a = 0;
		int equal = 0;
		for(int i = 0; i < s.length(); i++) {
			if(i > 0 && s.charAt(i) == s.charAt(i - 1) && i != s.length() - 1) {
				continue;
			} else if(i > 0 && s.charAt(i) == s.charAt(i - 1) && i == s.length() - 1) {
				break;
			}
			int result = 0;
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					result++;
				}
			}
			if(result > sum) {
				sum = result;
				a = s.charAt(i);
			} else if(result == sum) {
				equal = sum;
			}
		}
		if(sum > equal) {
			System.out.println(a);
		} else if(sum == equal) {
			System.out.println(0);
		}

	}

}
