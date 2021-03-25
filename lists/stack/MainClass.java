package lists.stack;

import java.util.Stack;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Stack<Integer> stack = new Stack();
		MyStack<Integer> stack = new MyStack<>();
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		int popped = stack.pop();
		popped = stack.pop();
		popped = stack.pop();
		System.out.println(popped);
//		int peeked = stack.peek();
//		System.out.println(peeked);


	}

}
