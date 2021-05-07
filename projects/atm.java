package projects;

import java.util.*;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {100, 200, 300, 550, 600};
		int money = 300;
	    Deque<Integer> d = new LinkedList<>();
	    for(int i = 0; i < a.length; i++) {
	    	d.add(a[i]);
	    }
	    boolean ans = present(d, money);
	    System.out.println(ans);

	}
	
	static boolean present(Deque<Integer> d, int m) {
		while(!d.isEmpty()) {
			if(!d.isEmpty() && d.removeFirst() == m) {
				return true;
			}
			if(!d.isEmpty() && d.removeLast() == m) {
				return true;
			}
		}
		return false;
	}

}
