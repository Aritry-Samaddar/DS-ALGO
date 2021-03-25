package lists.stack;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		Stack<Character> s = new Stack();
		boolean isBalanced = true;
        for(int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == 40 || x.charAt(i) == 91 || x.charAt(i) == 123) {
                s.push(x.charAt(i));
            } else {
            	char c1 = x.charAt(i);
            	Character c2 = 0;
            	if(!s.empty())
            	    c2 = s.peek();
            	if(!s.empty()) {
            		switch(c1) {
                	case '}' :
                		if(c2 != 123) isBalanced = false;
                		break;
                	case ']' :
                		if(c2 != 91) isBalanced = false;
                		break;
                	case ')' :
                		if(c2 != 40) isBalanced = false;
                		break;
                	}
            	}
            	if(!isBalanced) break;
            	if(!s.empty()) s.pop();
            	else {
            		isBalanced = false;
            		break;
            	}
            }
        }
        if(!s.empty()) isBalanced = false;
        if(isBalanced) {
        	System.out.println("Balanced");
        } else {
        	System.out.println("Not Balanced");
        }


	}

}
