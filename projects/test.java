package projects;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "";
//		a = 1 + "\t" + 2;
//		System.out.println(a);
//		
//		
//		int[] arr = {1, 2};
//		int[] brr = {3, 4};
//		
//		int[] newArr = Arrays.copyOf(arr, 3);
//		int[] newBrr = Arrays.copyOf(brr, 3);
//		String s = "0100";
//		System.out.println(s.charAt(0));
		String s = "1111";
		int sum = 0;
//        for(int i = 0; i < s.length() - 1; i++) {
//            if(s.charAt(i) == s.charAt(i + 1)) {
//            	sum += 1;
//                if(s.charAt(i + 1) == '0') {
//                	char a = s.charAt(i + 1);
//                    a = '1';
//                } else if(s.charAt(i + 1) == '1') {
//                	char b = s.charAt(i + 1);
//                    b = '0';
//                }
//            }
//        }
//		System.out.println(sum);

		for(int i = 0; i < s.length(); i++) {
			if(i % 2 == 0 && s.charAt(i) == '1') sum++;
			if(i % 2 != 0 && s.charAt(i) == '0') sum++;
		}
		System.out.println(Math.min(sum, s.length() - sum));
        		
		 

	}

}
