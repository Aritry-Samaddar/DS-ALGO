package lists.stack;

import lists.arrayLists.MyArrayList;

public class MyStack2<E> {
	
	private MyArrayList<E> al = new MyArrayList<>();
	
	void push(E e) {
		al.add(e);
	}
	
	E pop() throws Exception {
		if(al.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed.");
		}
		return al.removeLast();
	}
	
	E peek() throws Exception {
		if(al.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed.");
		}
		return al.getLast();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
