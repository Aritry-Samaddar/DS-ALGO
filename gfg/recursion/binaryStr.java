package gfg.recursion;

import java.util.*;

public class binaryStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		binaryString(4);

		int k = 3;
		char[] s = new char[k];
		s[0] = '0';
		generateAllStr(k, s, 1);
		s[0] = '1';
		generateAllStr(k, s, 1);
	}
	
//	static void binaryString(int size) {
//		String s;
//		for(int i = 0; Integer.toBinaryString(i).length() <= size; i++) {
//			boolean is = false;
//			s = Integer.toBinaryString(i);
//			if(s.length() < size) {
//				while(size - s.length() != 0) {
//					s = "0" + s;
//				}
//			}
//			char[] a = s.toCharArray();
//			for(int j = 0; j < a.length - 1; j++) {
//				if(a[j] == '1' && a[j] == a[j + 1]) {
//					is = true;
//					break;
//				}
//			}
//			if(is == false)
//			    System.out.println(a);
//		}
//	}

	static void generateAllStr(int k, char[] s, int n) {
		if(n == k) {
//			System.out.print(toString(s) + " ");
			for(int i = 0; i < s.length; i++) {
				System.out.print(s[i] + " ");
			}
			System.out.println();
			return;
		}
		if(s[n - 1] == '1') {
			s[n] = '0';
			generateAllStr(k, s, n + 1);
		} 
		if(s[n - 1] == '0') {
			s[n] = '0';
			generateAllStr(k, s, n + 1);
			s[n] = '1';
			generateAllStr(k, s, n + 1);
		}
	}
	
	static String toString(char[] a) {
        String string = new String(a);
        return string;
    }
}
