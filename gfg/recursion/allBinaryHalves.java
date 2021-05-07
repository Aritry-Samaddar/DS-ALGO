package gfg.recursion;

public class allBinaryHalves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bin(4);

	}
	
	static void bin(int n) {
		if(n <= 0) return;
		char[] s = new char[n];
		s[0] = '0';
		generateAllStr(n, s, 1);
		s[0] = '1';
		generateAllStr(n, s, 1);
	}

    static void generateAllStr(int k, char[] s, int n) {
    	if(n == k && k % 2 == 0 && sum(s, 0, k / 2) == sum(s, k / 2, k)) {
			System.out.print(toString(s) + " ");
			System.out.println();
			return;
		}
    	if(n == k && k % 2 == 0 && sum(s, 0, k / 2) != sum(s, k / 2, k)) {
    		return;
    	}
    	if(n == k && k % 2 != 0 && sum(s, 0, k / 2) == sum(s, k / 2 + 1, k)) {
    		System.out.print(toString(s) + " ");
			System.out.println();
			return;
    	}
    	if(n == k && k % 2 != 0 && sum(s, 0, k / 2) != sum(s, k / 2 + 1, k)) {
    		return;
    	}
		if(s[n - 1] == '1') {
			s[n] = '0';
			generateAllStr(k, s, n + 1);
			s[n] = '1';
			generateAllStr(k, s, n + 1);
		} 
		if(s[n - 1] == '0') {
			s[n] = '0';
			generateAllStr(k, s, n + 1);
			s[n] = '1';
			generateAllStr(k, s, n + 1);
		}
	}
	
    static String toString(char[] a) {
        String string = new String(a);
        return string;
    }
    
    static int sum(char[] s, int start, int end) {
    	int ans = 0;
    	for(int i = start; i < end; i++) {
    		ans += s[i];
    	}
    	return ans;
    }

}
