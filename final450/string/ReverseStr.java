package final450.string;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
//		for(int i = n.length() - 1; i >= 0; i--) {
//			char temp = n.charAt(i);
//			System.out.print(temp);
//		}
		char[] s = new char[n.length()];
		for(int i = 0; i < n.length(); i++) {
			s[i] = n.charAt(i);
		}
		int i = 0;
		int j = s.length - 1;
		while(i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		for(char e : s) {
			System.out.print(e);
		}

	}

}
