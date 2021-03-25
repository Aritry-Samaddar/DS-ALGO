package tcs;

import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] s1 = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			int m = s.charAt(i);
			switch(m) {
			case 'a' : {
				s1[i] = 'z';
				break;
			}
			case 'b' : {
				s1[i] = 'y';
				break;
			}
			case 'c' : {
				s1[i] = 'x';
				break;
			}
			case 'd' : {
				s1[i] = 'w';
				break;
			}
			case 'e' : {
				s1[i] = 'v';
				break;
			}
			case 'f' : {
				s1[i] = 'u';
				break;
			}
			case 'g' : {
				s1[i] = 't';
				break;
			}
			case 'h' : {
				s1[i] = 's';
				break;
			}
			case 'i' : {
				s1[i] = 'r';
				break;
			}
			case 'j' : {
				s1[i] = 'q';
				break;
			}
			case 'k' : {
				s1[i] = 'p';
				break;
			}
			case 'l' : {
				s1[i] = 'o';
				break;
			}
			case 'm' : {
				s1[i] = 'n';
				break;
			}
			case 'n' : {
				s1[i] = 'm';
				break;
			}
			case 'o' : {
				s1[i] = 'l';
				break;
			}
			case 'p' : {
				s1[i] = 'k';
				break;
			}
			case 'q' : {
				s1[i] = 'j';
				break;
			}
			case 'r' : {
				s1[i] = 'i';
				break;
			}
			case 's' : {
				s1[i] = 'h';
				break;
			}
			case 't' : {
				s1[i] = 'g';
				break;
			}
			case 'u' : {
				s1[i] = 'f';
				break;
			}
			case 'v' : {
				s1[i] = 'e';
				break;
			}
			case 'w' : {
				s1[i] = 'd';
				break;
			}
			case 'x' : {
				s1[i] = 'c';
				break;
			}
			case 'y' : {
				s1[i] = 'b';
				break;
			}
			case 'z' : {
				s1[i] = 'a';
				break;
			}
			}
		}
		for(char e : s1) {
			System.out.print(e);
		}
		

	}

}
