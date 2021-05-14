package gfg.recursion;

import java.util.*;

public class minStepsToD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> curr = new ArrayList<>();
		System.out.println(fun(curr, 5, -1, 1, 0));
		System.out.println(curr);

	}

	static int fun(ArrayList<Integer> curr, int d, int left, int right, int ans) {
		if(ans == d) {
			return curr.size();
		}
		if(ans < d) {
			curr.add(right);
			return fun(curr, d, left, right + 1, ans + right);
		} else {
			curr.add(left);
			return fun(curr, d, left - 1, right, ans + left);
		}
	}
}
