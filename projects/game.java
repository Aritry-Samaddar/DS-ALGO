package projects;

import java.util.*;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		int ans = beautifulFunction(1, set);
		System.out.println(ans);

	}
	
	static int beautifulFunction(int n, Set<Integer> set) {
		String s = Integer.toString(n);
		while(s.charAt(s.length() - 1) == '0') {
			s = s.substring(0, s.length() - 1);
		}
		n = Integer.parseInt(s);
		if(set.contains(n)) return set.size();
		set.add(n);
		return beautifulFunction(n + 1, set);
	}

}
