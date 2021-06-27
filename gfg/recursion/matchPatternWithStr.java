package gfg.recursion;

import java.util.*;

public class matchPatternWithStr {
    
	static Map<Character, String> map = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "GeeksforGeeks";
		String p = "GfG";
		match(s, p, p);
	}

	static void match(String str, String pat, String p) {
		if(str.length() == 0 && pat.length() == 0) {
			Set<Character> set = new HashSet<>();
			for(int i = 0; i < p.length(); i++) {
				if(!set.contains(p.charAt(i))) {
					System.out.println(p.charAt(i) + " -> " + map.get(p.charAt(i)));
					set.add(p.charAt(i));
				}
			}
			return;
		}
		if(pat.length() == 0 && str.length() != 0) return;
		if(pat.length() != 0 && str.length() == 0) return;
		char Char = pat.charAt(0);
		String rest = pat.substring(1);
		if(map.containsKey(Char)) {
			String curr = map.get(Char);
			if(str.length() >= curr.length()) {
				String left = str.substring(0, curr.length());
				String right = str.substring(curr.length());
				if(left.equals(curr)) {
					match(right, rest, p);
				}
			}
		} else {
			for(int i = 0; i < str.length(); i++) {
				String left = str.substring(0, i + 1);
				String right = str.substring(i + 1);
				map.put(Char, left);
				match(right, rest, p);
				map.remove(Char);
			}
		}
	}
}
