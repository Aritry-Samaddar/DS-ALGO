package strings;

public class Anagrams3 {

	public static void main(String[] args) {
		
		String a = "aa#@b";
		String b = "ab@#a^";
		boolean isAnagram = true;
		int al[] = new int[256];
		int bl[] = new int[256];
		for(char c: a.toCharArray()) {
			//int index = (int)c;
			al[c]++;
		}
		for(char c: b.toCharArray()) {
			//int index = (int)c;
			bl[c]++;
		}
		for(int i = 0; i < 256; i++) {
			if(al[i] != bl[i]) {
				isAnagram = false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("Anagram!!");
		} else {
			System.out.println("Not Anagram!!");
		}

	}

}
