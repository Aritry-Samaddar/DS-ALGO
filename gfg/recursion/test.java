package gfg.recursion;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		replace()
//		trim()
//		split()
//		toBinaryString()
//		int a=Character.getNumericValue(c);
//		int a=Integer.parseInt(String.valueOf(c));
//		ArrayList<char[]> al = new ArrayList<>();
		
//		String s = " Hello I'm your String";
//		String[] s1 = s.trim().split("\\s+");
//		for(int i = 0; i < s1.length; i++) {
//			System.out.println(s1[i]);
//		}
//		s = s.replaceAll("\\s+", "");
//		System.out.println(s);
//		s.replace("r", "d");
//		System.out.println(s);
//		String s = "ari";
//		String[] s1 = s.split("");
//		for(int i = 0; i < s1.length; i++) {
//			System.out.print(s1[i] + " ");
//		}
//		String s = "aritry";
//		boolean ans = find(s,'z', 0);
//		System.out.println(ans);
		
//		char[] a = {' '};
//		int ans = 0;
//		for(int i = 0; i < a.length; i++) {
//			ans += Character.getNumericValue(a[i]);
//			System.out.println(ans);
//		}
//		System.out.println(ans);
		

	}
	
	static boolean find(String s, char ch, int i) {
		if(i >= s.length()) return false;
		if(s.charAt(i) == ch)
			return true;
		else
			return find(s, ch, i + 1);
	}

}
