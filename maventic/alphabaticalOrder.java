package maventic;

import java.util.*;

public class alphabaticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "Tutorials";
//		char[] ch = s.toCharArray();
//		for(int i = 0; i < s.length(); i++) {
//			for(int j = i + 1; j < s.length(); j++) {
//				if(ch[i] > ch[j]) {
//					char temp = ch[i];
//					ch[i] = ch[j];
//					ch[j] = temp;
//				}
//			}
//		}
//		for(char e : ch) {
//			System.out.print(e);
//		}
		
		String s = "aritry";
		Set<Character> set = new TreeSet<>(Collections.reverseOrder());
		for(int i = 0; i < s.length(); i++) {
			if(!set.contains(s.charAt(i))) set.add(s.charAt(i));
		}
		System.out.println(set);
	}

}
