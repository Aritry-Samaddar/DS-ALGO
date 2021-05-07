package gfg.recursion;

public class size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "GEEKSFORGEEKS";
		System.out.println(len(s));

	}
	
//	static int len(String s, int n) {
//		if(n == 1) return 1;
//		return len(s, n - 1) + 1;
//	}
	
	static int len(String s) {
		if(s.equals("")) return 0;
		else return len(s.substring(1)) + 1;
	}

}
