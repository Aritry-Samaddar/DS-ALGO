package strings;

import java.util.Scanner;

public class Anagrams6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String a = sc.nextLine();
		System.out.println("Enter second string: ");
		String b = sc.nextLine();
		char al[] = a.toCharArray();
		char bl[] = b.toCharArray();
		boolean sorted = true;
		int c = 0;
		int d = 0;
		for(int i = 0; i < a.length() - 1; i++) {
			for(int j = 0; j < a.length() - 1 - i; j++) {
				if(al[j + 1] < al[j]) {
					char temp = al[j + 1];
					al[j + 1] = al[j];
					al[j] = temp;
					sorted = false;
				}
			}
			if(sorted == true) break;
		}
		for(int item: al) {
			c = item;
		}
		
		
		for(int i = 0; i < b.length() - 1; i++) {
			for(int j = 0; j < b.length() - 1 - i; j++) {
				if(bl[j + 1] < bl[j]) {
					char temp = bl[j + 1];
					bl[j + 1] = bl[j];
					bl[j] = temp;
					sorted = false;
				}
			}
			if(sorted == true) break;
		}
		for(int item: bl) {
			d = item;
		}
		
		
		if(c == d) {
			System.out.println("Anagram!!");
		} else {
			System.out.println("Not Anagram!!");
		}
	}

}
