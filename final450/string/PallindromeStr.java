package final450.string;

import java.util.Scanner;

public class PallindromeStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int i = 0;
        int j = S.length() - 1;
        boolean t = true;
        while(i < j) {
            if(S.charAt(i) == S.charAt(j)) {
                i++;
                j--;
            } else {
            	t = false;
                System.out.println(false);
                break;
            }
        }
        if(t != false)
        System.out.println(true);

	}

}
