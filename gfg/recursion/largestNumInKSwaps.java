package gfg.recursion;

public class largestNumInKSwaps {

	static String max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max = "129814999";
		fun(max, 4);
		System.out.println(max);

	}

	static String swap(String s, int i, int j) {
		char ith = s.charAt(i);
		char jth = s.charAt(j);
		String first = s.substring(0, i);
		String middle = s.substring(i + 1, j);
		String last = s.substring(j + 1);
		
		return first + jth + middle + ith + last;
	}
	
	static void fun(String s, int k) {
		if(Integer.parseInt(s) > Integer.parseInt(max)) {
			max = s;
		}
		if(k == 0) {
			return;
		}
		for(int i = 0; i < s.length() - 1; i++) {
			for(int j = i + 1; j < s.length(); j++) {
				if(s.charAt(i) < s.charAt(j)) {
					String swapped = swap(s, i, j);
					fun(swapped, k - 1);
				}
			}
		}
	}
}
