package maventic;

public class largest3digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 967342;
		String main = String.valueOf(num);
		int k = 3;
		int ans = 0;
		for(int i = 0; i <= main.length() - k; i++) {
			int n = Integer.parseInt(main.substring(i, i + k));
			if(n > ans) ans = n;
		}
		System.out.println(ans);
	}
}
