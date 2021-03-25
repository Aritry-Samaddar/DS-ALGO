package lists.stack;

import java.util.ArrayList;
import java.util.Stack;

public class PrintBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String S = "(aa(bdc))p(dee)";
//		String S = "(((()(";
		String S = "(()())";
		ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int a = 1;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '(') {
                s.push(a);
                al.add(a);
                a++;
            } else if(S.charAt(i) == ')') {
                al.add(s.pop());
            }
        }
        System.out.println(al);

	}

}
