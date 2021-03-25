package tcs;

import java.util.Scanner;

public class Five {
	public static void getCase(int n) {
		int x = 0, y = 0;
		int dis = 10;
		char c = 'R';
		int i = 0;
		while(i < n) {
			switch(c) {
			case 'R' : {
				x += dis;
				c = 'U';
				dis += 10;
				break;
			}
			case 'U' : {
				y += dis;
				c = 'L';
				dis += 10;
				break;
			}
			case 'L' : {
				x -= dis;
				c = 'D';
				dis += 10;
				break;
			}
			case 'D' : {
				y -= dis;
				c = 'A';
				dis += 10;
				break;
			}
			case 'A' : {
				x += dis;
				c = 'R';
				dis += 10;
				break;
			}
			}
			i++;
		}
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getCase(n);

	}

}
