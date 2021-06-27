package maventic;

public class splitSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = " aritry adity arpan tuhin ";
		a = a.trim();
		String ans = "";
		String[] b = a.split(" ");
		for(int i = 0; i < b.length; i++) {
			ans += b[i] + ",";
		}
		System.out.println(ans.substring(0, a.length()));
		
		System.out.println(a.replaceAll(" ", ","));
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 32) {
				a = a.replace(a.charAt(i), ',');
			}
		}
		System.out.println(a);
		
		for(int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		StringBuilder rS = new StringBuilder();
		for(String words : b) {
			String rW = new StringBuilder(words).reverse().toString();
			rS.append(rW).append(" ");
		}
		System.out.println(rS);
	}

}
