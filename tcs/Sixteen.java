package tcs;

import java.util.Scanner;

public class Sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] b = new char[s.length()];
		char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int i = 0;
		while(i < s.length()) {
			for(int j = 0; j < a.length; j++) {
				if(s.charAt(i) == a[j]) {
					b[i] = a[a.length - 1 - j];
				}
			}
			i++;
		}
		for(char e : b) {
			System.out.print(e);
		}

	}

}
