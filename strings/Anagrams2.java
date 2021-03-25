package strings;

public class Anagrams2 {

	public static void main(String[] args) {
		
		String a = "cat";
		String b = "act";
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];
		for(int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			for(int j = 0; j < b.length(); j++) {
				if(b.charAt(j) == c && !visited[j]) {
					visited[j] = true;
					isAnagram = true;
					break;
				}
			}
			if(!isAnagram) {
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
