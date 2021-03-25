package deque;
// Implementing Deque using Doubly LinkedList;
public class MyDeque<E> {
	
	Node<E> head, tail;
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
	}
	
	public void addToLast(E data) {
		Node<E> toAdd = new Node(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		tail.next = toAdd;
		toAdd.prev = tail;
		tail = toAdd;
	}
	
	public E removeLast() {
		if(head == null) {
			return null;
		}
		Node<E> toRemove = tail;
		tail = tail.next;
		tail.prev = null;
		if(tail == null) {
			head = null;
		}
		return toRemove.data;
	}
	
	public E removeFirst() {
		if(head == null) {
			return null;
		}
		Node<E> toRemove = head;
		head = head.next;
		head.prev = null;
		if(head == null) {
			tail = null;
		}
		return toRemove.data;
	}
	
	public E peekFirst() {
		if(head == null) {
			return null;
		}
		return head.data;
	}
	
	public E peekLast() {
		if(head == null) {
			return null;
		}
		return tail.data;
	}
	
	public static class Node<E> {
		E data;
		Node<E> next, prev;
		public Node(E data) {
			this.data = data;
			next = prev = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
