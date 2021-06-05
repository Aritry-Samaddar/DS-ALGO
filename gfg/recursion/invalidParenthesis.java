package gfg.recursion;

import java.util.*;

public class invalidParenthesis {

	static ArrayList<String> ans = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()())()";
		
		fun(s, s.length(), 0);
		System.out.println(ans);

	}

	static boolean isValid(String s, int i, int open, int close) {
		if(i == s.length()) {
			if(open == close) return true;
			return false;
		}
		if(s.charAt(i) == '(') {
			open++;
		}
		if(s.charAt(i) == ')') {
			close++;
		}
		return isValid(s, i + 1, open, close);
	}
	
	static void fun(String s, int n, int index) {
		if(index >= n) return;
//		if(n == 0) return;
		for(int i = index; i < n; i++) {
			String temp = s;
		    s.replace(s.substring(i, i + 1), "");
		    if(isValid(s, 0, 0, 0)) {
		    	ans.add(s);
		    	fun(temp, n - 1, i + 1);
		    	
		    }
		}
	}
}
