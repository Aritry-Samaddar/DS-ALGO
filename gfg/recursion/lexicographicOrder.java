package gfg.recursion;

import java.util.*;

public class lexicographicOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "abc";
//		char[] a = s.toCharArray();
//		Arrays.sort(a);
//		fun(new String(a), -1, s.length(), "");
		
		for(int i = 1; i <= 9; i++) {
			bfs(i, 500);
		}

	}

//	static void fun(String s, int index, int n, String curr) {
//		if(index >= n) {
//			return;
//		}
//		if(curr != null && !curr.trim().isEmpty()) {
//			System.out.println(curr);
//		}
//		for(int i = index + 1; i < n; i++) {
//			curr += s.charAt(i);
//			fun(s, i, n, curr);
//			curr = curr.substring(0, curr.length() - 1);
//		}
//	}
	
	static void bfs(int s, int n) {
		if(s > n) return;
		System.out.println(s);
		for(int i = 0; i < 10; i++) {
			bfs(10 * s + i, n);
		}
	}

}
