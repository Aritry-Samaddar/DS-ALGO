package lists.stack;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		Stack<Character> s = new Stack();
		boolean isBalanced = true;
		for(int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				s.push(ch);
				continue;
			}
			if(s.empty()) {
				isBalanced = false;
				break;
			}
			if(ch == ')') {
				if(s.peek() == '(') {
					s.pop();
				} else {
					isBalanced = false;
					break;
				}
			}
			if(ch == '}') {
				if(s.peek() == '{') {
					s.pop();
				} else {
					isBalanced = false;
					break;
				}
			}
			if(ch == ']') {
				if(s.peek() == '[') {
					s.pop();
				} else {
					isBalanced = false;
					break;
				}
			}
		}
		if(!s.empty()) isBalanced = false;
		if(isBalanced) System.out.println("Balanced");
		else System.out.println("Not Balanced");

	}

}
