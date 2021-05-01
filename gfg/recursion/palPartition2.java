package gfg.recursion;

import java.util.*;

public class palPartition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		String s = "forgeeksskeegfor";
		Deque<String> d = new LinkedList<>();
		ArrayList<String> al = new ArrayList<>();
		part(s, 0, d, al, "");
		System.out.println(space(s));
		long end = System.currentTimeMillis();
        System.out.println(end - start);

	}
	
	static String space(String s) {
		String n = "";
		for(int i = 0; i < s.length(); i++) {
			n += s.charAt(i) + " ";
		}
		return n;
	}
	
	static void part(String f, int index, Deque<String> d, ArrayList<String> al, String curr) {
		if(!al.isEmpty())
			for(String e : al) {
				System.out.println(e);
			}
		al.clear();
		if(index >= f.length()) return;
		Deque<String> ans = partition(f, index + 1, String.valueOf(f.charAt(index)), d);
		while(!ans.isEmpty()) {
			String take = ans.removeFirst();
			if(index != 0 && take.length() < f.length())
			    curr = space(f.substring(0, index)) + take + " " + space(f.substring(take.length() + f.substring(0, index).length(), f.length()));
			else if(index == 0 && take.length() < f.length())
				curr = take + " " + space(f.substring(take.length(), f.length()));
			else
				curr = take;
				
			al.add(curr);
		}
		part(f, index + 1, d, al, curr);
		
	}
	
	static Deque<String> partition(String s, int index, String ans, Deque<String> d) {
		if(index >= s.length()) return d;
		ans += s.charAt(index);
		if(ans.equals(strPal(ans, ans.length()))) {
			d.addLast(ans);
			return partition(s, index + 1, ans, d);
		}
		return partition(s, index + 1, ans, d);
	}

	static String strPal(String s, int n) {
		if(n == 1) return String.valueOf(s.charAt(0));
		return s.charAt(n - 1) + strPal(s, n - 1);
	}
}
