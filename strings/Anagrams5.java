package strings;

import java.util.Scanner;

public class Anagrams5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String a = sc.nextLine();
		a = a.replaceAll("\\s+", " ").trim();
		String b = " ";
		String d = "";
		String c = "";
		boolean checked[] = new boolean[a.length()];
		for(int j = 0; j < a.length(); j++) {
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != b.charAt(0) && !checked[i]) {
				checked[i] = true;
				c += a.charAt(i);
			} if(a.charAt(i) == b.charAt(0) && !checked[i]) {
				checked[i] = true;
				break;
			}
			}
		d = c + " " + d;
		c = "";
		if(d.length() > a.length()) {
			break;
		}
		}
		System.out.println(d);
	}
		

	}


