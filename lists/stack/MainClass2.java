package lists.stack;

public class MainClass2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MyStack2<Integer> stack = new MyStack2<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		int popped = stack.pop();
		System.out.println(popped);
		int peeked = stack.peek();
		System.out.println(peeked);

	}

}
