package lists.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class RemoveRepeatNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
		    long n = sc.nextLong();
//		    ArrayList<Integer> al = new ArrayList<>();
//		    int temp2 = n;
//		    while(temp2 > 0) {
//		    	int lastDigit = temp2 % 10;
//		        temp2 /= 10;
//		        al.add(lastDigit);
//		    }
//		    Collections.sort(al);
//		    int m = 0;
//		    int j = 0;
//		    while(j < al.size()) {
//		    	m += al.get(j);
//		    	j++;
//		    }
		    Stack<Long> s = new Stack<>();
		    long temp = n;
		    while(temp > 0) {
		        long lastDigit = temp % 10;
		        temp /= 10;
		        if(s.isEmpty()) {
		            s.push(lastDigit);
		        } else {
		            long num = s.peek();
		            if(num != lastDigit) {
		                s.push(lastDigit);
		            }
		        }
		    }
		    while(s.size() != 0) {
		        System.out.print(s.pop());
		    }
		    System.out.println();
		}

	}

}
