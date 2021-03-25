package tcs;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s[] = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};
		int n = s.length;
		String a = sc.nextLine();
		int b = 0;
		for(int i = 0; i < n; i++) {
			if(s[i].equals(a)) {
				b = 1;
				break;
			}
		}
		if(b == 1) {
			System.out.println(a + " is a keyword.");
		} else {
			System.out.println(a + " is not a keyword.");
		}

	}

}
