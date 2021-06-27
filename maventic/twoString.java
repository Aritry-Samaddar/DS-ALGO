package maventic;

import java.util.*;

public class twoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aritry";
		String s2 = "rrtiry";
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		
		System.out.println(fun(map1, map2, s1, s2));
		
//		boolean is = true;
//		if(s1.length() == s2.length()) {
//			for(int i = 0; i < s1.length(); i++) {
//				if(map1.containsKey(s1.charAt(i))) {
//					map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
//				} else {
//					map1.put(s1.charAt(i), 1);
//				}
//			}
//			
//			for(int i = 0; i < s2.length(); i++) {
//				if(map1.containsKey(s2.charAt(i))) {
//					map1.put(s2.charAt(i), map1.get(s2.charAt(i)) - 1);
//				} else {
//					is = false;
//					System.out.println(false);
//					break;
//				}
//			}
//		} else {
//			is = false;
//			System.out.println(false);
//		}
//		if(is == true) {
//			for(int e : map1.values()) {
//				if(e != 0) {
//					System.out.println(false);
//					is = false;
//					break;
//				}
//			}
//			if(is == true) System.out.println(true);
//		}
	}

	static boolean fun(Map<Character, Integer> map1, Map<Character, Integer> map2, String s1, String s2) {
		if(s1.length() == s2.length()) {
			for(int i = 0; i < s1.length(); i++) {
				if(map1.containsKey(s1.charAt(i))) {
					map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
				} else {
					map1.put(s1.charAt(i), 1);
				}
			}
			
			for(int i = 0; i < s2.length(); i++) {
				if(map1.containsKey(s2.charAt(i))) {
					map1.put(s2.charAt(i), map1.get(s2.charAt(i)) - 1);
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		for(int e : map1.values()) {
			if(e != 0) {
				return false;
			}
		}
		return true;
	}
}
