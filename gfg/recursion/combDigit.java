package gfg.recursion;

import java.util.*;

public class combDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234";
		int n = s.length();
		ArrayList<ArrayList<String>> al = new ArrayList<>();
		Deque<String> curr = new LinkedList<>();
		digit(al, curr, s, n, 0);
		for(int i = 0; i < al.size(); i++) {
			for(int j = 0; j < al.get(i).size(); j++) {
				System.out.print(al.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}
	
	static void digit(ArrayList<ArrayList<String>> al, Deque<String> curr, String s, int n, int index) {
		if(index >= n) {
			al.add(new ArrayList<>(curr));
			return;
		}
		for(int i = index; i < n; i++) {
			curr.addLast(s.substring(index, i + 1));
			digit(al, curr, s, n, i + 1);
			curr.removeLast();
		}
	}

}
