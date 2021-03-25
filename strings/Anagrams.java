package strings;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String a = sc.nextLine();
		System.out.println("Enter second string: ");
		String b = sc.nextLine();
		int no3 = 0;
		if(a.length() == b.length()) {
			for(int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				int no = 0;
				int no2 = 0;
				for(int j = 0; j < a.length(); j++) {
					if(c == a.charAt(j)) {
						no += 1;
					}
				}
				for(int p = 0; p < b.length(); p++) {
					if(c == b.charAt(p)) {
								no2 += 1;
					}
				}
				if(no == no2) {
					no3 += 1;
				}
			}
		}
		if(no3 == a.length()) {
			System.out.println("Anagrams!!");
		} else {
			System.out.println("Not Anagrams!!");
		}
		

	}

}
