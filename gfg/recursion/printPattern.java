package gfg.recursion;

import java.util.*;

public class printPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(16, 16, true);

	}

	static void fun(int n, int i, boolean flag) {
		if(n > i && flag == false) return;
		System.out.print(n + " ");
		if(n > 0 && flag == true) {
			fun(n - 5, i, true);
		} else {
			fun(n + 5, i, false);
		}
	}
}
