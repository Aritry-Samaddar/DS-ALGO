package tcs;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int a = n.length();
		int sum = 0;
		int b = 0;
		int c = 0;
		for(int i = 0; i < a; i++) {
			if(i % 2 == 0) {
				b += n.charAt(i) - '0';
			} else if(i % 2 != 0) {
				c += n.charAt(i) - '0';
			}
		}
		sum = Math.abs(b - c);
		System.out.println(sum);
		

	}

}
