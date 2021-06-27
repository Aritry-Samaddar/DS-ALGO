package maventic;

import java.util.*;

public class sameName2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "ryaan";
		String b = "nagesh";
		int count = 0;
		if(a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		boolean[] isa = new boolean[a.length()];
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < b.length(); i++) {
			if(a.charAt(i) == b.charAt(i)) {
				count += 2;
				isa[i] = true;
			} else {
				if(map.containsKey(b.charAt(i))) {
					map.put(b.charAt(i), map.get(b.charAt(i)) + 1);
				} else {
					map.put(b.charAt(i), 1);
				}
			}
		}
		
		for(int i = 0; i < a.length(); i++) {
			if(isa[i] != true) {
				if(map.containsKey(a.charAt(i)) && !((map.get(a.charAt(i)) - 1) < 0)) {
					map.put(a.charAt(i), map.get(a.charAt(i)) - 1);
					count += 1;
				}
			}
		}
		
		System.out.println(count);
	}

}
