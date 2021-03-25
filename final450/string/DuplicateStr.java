package final450.string;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateStr {
	static final int NO_OF_CHARS = 	256;
	 /* Fills count array with 
    frequency of characters */
	static void fillCharCounts(String str, int[] count) {
        for (int i = 0; i < str.length(); i++) {
        	count[str.charAt(i)]++;
        }     
    }
	/* Print duplicates present 
    in the passed string */
	
	static void printDups(String str) {
        // Create an array of size 
        // 256 and fill count of
        // every character in it
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str, count);
 
        for (int i = 0; i < NO_OF_CHARS; i++)
            if (count[i] > 1)
                System.out.println((char)(i) + ", count = " + count[i]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String S = sc.nextLine();
//		char[] s = new char[S.length()];
//		for(int i = 0; i < S.length(); i++) {
//			s[i] = S.charAt(i);
//		}
//		Arrays.sort(s);
//		
//		char a;
//		char b;
//		boolean t = true;
//		for(int i = 0; i < s.length; i++) {
//			int count = 1;
//			while(i < s.length - 1 && s[i] == s[i + 1]) {
//				count++;
//				i++;
//				t = false;
//			}
//			if(t == false)
//			System.out.println(s[i] + " : " + count);
//			t = true;
//		}

		
		
		String str = "test string";
        printDups(str);
	}

}
