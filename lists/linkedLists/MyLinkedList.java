package lists.linkedLists;

public class MyLinkedList<E> {
	
	Node Head;
	
	
	public void add(E data) {
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			Head = toAdd;
			return;
		}
		
		Node temp = Head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	public boolean isEmpty() {
		return Head == null;
	}
	
	void print() {
		Node temp = Head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	void addAll(MyLinkedList name) {
		if(isEmpty()) {
//			name.print();
//			return;
			for(int i = 0; i < name.size(); i++) {
				add((E)name.get(i));
			}
			return;
		}
		
		Node temp = Head;
		Node temp2 = name.Head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		while(temp2 != null) {
			temp.next = temp2;
			temp = temp.next;
			temp2 = temp2.next;
		}
//		print();
	}
	
	E get(int index) {
		Node temp = Head;
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return (E) temp.data;
	}
	
	Object set(int index, E value) {
		Node temp = Head;
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data = value;
	}
	
	public void remove(int index) {
		if(index == 0) {
			Head = Head.next;
			return;
		}
		Node temp = Head;
		for(int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	int size() {
		int count = 0;
		Node temp = Head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	void removeAll() {
		Node temp = Head;
		for(int i = 0; i < size(); i++) {
			temp.next = temp.next.next;
		}
		Head = temp.next;
	}
	
	boolean contains(E data) {
		boolean isPresent = false;
		for(int i = 0; i < size(); i++) {
			if(get(i) == data) {
				isPresent = true;
				break;
			}
		}
		if(isPresent == true) {
			return true;
		}
		return false;
	}
	
	void insert(int index, E data) {
		Node toInsert = new Node(data);
		Node temp = Head;
		for(int i = 0; i < index; i++) {
			if(i == index - 1) {
				Node temp2 = temp;
				toInsert.next = temp.next;
				temp2.next = toInsert;
				break;
			}
			temp = temp.next;
		}
	}
	
	public E removeLast() throws Exception {
		Node temp = Head;
		if(temp == null) {
			throw new Exception("Can not remove last element from empty linked list.");
		}
		if(temp.next == null) {
			Node toRemove = Head;
			Head = null;
			return (E) toRemove.data;
		}
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node toRemove = temp.next;
		temp.next = null;
		return (E) toRemove.data;
	}
	
	public E getLast() throws Exception {
		Node temp = Head;
		if(temp == null) {
			throw new Exception("Can not peek last element from empty linked list.");
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		return (E) temp.data;
	}





	public static class Node<E> {
		public E data;
		public Node next;
		Node prev;
		public Node(E data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
