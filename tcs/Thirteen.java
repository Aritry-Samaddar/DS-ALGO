package tcs;
import java.util.*;
public class Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a[] = new String[3];
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextLine();
		}
		
		char[] b = a[0].toCharArray();
		for(int i = 0; i < b.length; i++) {
			
			if(b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u' || b[i] == 'A' || b[i] == 'E' || b[i] == 'I' || b[i] == 'O' || b[i] == 'U') {
				b[i] = '*';
			}
		}
		char[] c = a[1].toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(!(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U')) {
				c[i] = '@';
			}
		}
		char[] d = a[2].toCharArray();
		for(int i = 0; i < d.length; i++) {
			int temp = (int) d[i];
			temp = temp - 32;
			d[i] = (char) temp;
		}
		
		for(char item : b) {
			System.out.print(item);
		}
		for(char item2 : c) {
			System.out.print(item2);
		}
		for(char item3 : d) {
			System.out.print(item3);
		}

	}

}
