package tcs;

import java.util.Scanner;

public class Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				result += (char)(122 - (s.charAt(i) - 97));
			} else {
				System.out.println("invalid input");
			}
		}
		System.out.println(result);

	}

}
