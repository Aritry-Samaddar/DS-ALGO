package gfg.recursion;

import java.util.*;

public class wordBreak {

	static ArrayList<String> al = new ArrayList<>();
	static ArrayList<ArrayList<String>> a = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();
		set.add("i");
		set.add("like");
		set.add("sam");
		set.add("sung");
		set.add("samsung");
		set.add("mobile");
		set.add("ice");
		set.add("and");
		set.add("cream");
		set.add("icecream");
		set.add("man");
		set.add("go");
		set.add("mango");
		String s = "ilikeicecreamandmango";
		fun(s, s.length(), 0, set);
		System.out.println(a);
	}

	static void fun(String s, int n, int index, Set<String> set) {
		if(index == n) {
			a.add(new ArrayList<>(al));
			return;
		}
		for(int i = index; i < n; i++) {
			if(set.contains(s.substring(index, i + 1))) {
				al.add(s.substring(index, i + 1));
				fun(s, n, i + 1, set);
				al.remove(al.size() - 1);
			}
		}
	}
}
