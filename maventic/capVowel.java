package maventic;

public class capVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "java made so easy";
		s = s.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U");
		System.out.println(s);
	}

}
