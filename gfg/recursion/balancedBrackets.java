package gfg.recursion;

public class balancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun("", 0, 0, 3);
		
	}

	static void fun(String s, int open, int close, int n) {
		if(close == n) {
			System.out.print(s + " ");
			System.out.println();
			return;
		}
		if(open < n) fun(s + "(", open + 1, close, n);
		if(open > close) fun(s + ")", open, close + 1, n);
	}
}
