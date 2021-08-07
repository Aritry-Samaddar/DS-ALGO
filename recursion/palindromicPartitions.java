package recursion;

public class palindromicPartitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "geeks";
		func2(s, "");
	}

	static void func2(String s, String ans) {
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            String prefix = s.substring(0, i+1);
            String rest = s.substring(i+1);
            if(isPalindrome(prefix)) {
                func2(rest, ans + prefix + " ");
            }
        }
    }
    
    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j)
        if(s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }
}
