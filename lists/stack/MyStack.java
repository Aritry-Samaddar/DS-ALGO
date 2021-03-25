package lists.stack;

import lists.linkedLists.MyLinkedList;

// Stack using LinkedList
public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed.");
		}
		return ll.removeLast();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed.");
		}
		return ll.getLast();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
