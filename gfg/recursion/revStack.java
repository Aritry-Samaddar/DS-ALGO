package gfg.recursion;

import java.util.Stack;

public class revStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		Stack<Integer> s1 = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		Stack<Integer> ans = revStk(s, s1);
		System.out.println(ans);
		

	}
	
	static Stack<Integer> revStk(Stack<Integer> s, Stack<Integer> p) {
		if(s.empty()) {
			return p;
		}
		p.push(s.pop());
		return revStk(s, p);
	}

}
