package deque;
// Implementing Deque, Queue, Stack using Arrays;
import lists.arrayLists.MyArrayList;
public class MyArrayDeque<E> {
	
	private MyArrayList<E> al = new MyArrayList<>();
	private int head = -1, tail = -1;
	private boolean stack = false, queue = false;
	
	public void addFirst(E e) throws Exception {
		if(e == null) {
			throw new Exception("Data can not be null.");
		}
		if(head == -1) {
			al.add(e);
			head = tail = 0;
			return;
		}
		al.add(e);
		head++;
	}
	
	public void offerFirst(E e) throws Exception {
		addFirst(e);
	}
	
	public E removeFirst() throws Exception {
		if(head == -1) {
			throw new Exception("Can not remove element from an empty Deque.");
		}
		E toRemove = al.remove(head);
		if(tail == 0)
		    head--;
		else
			tail--;
		if(head == -1) {
			tail = -1;
		}
		return toRemove;
	}
	
	public E pollFirst() throws Exception {
		if(head == -1) {
			return null;
		}
		E toRemove = al.remove(head);
		if(tail == 0)
		    head--;
		else
			tail--;
		if(head == -1) {
			tail = -1;
		}
		return toRemove;
	}
	
	public E getFirst() throws Exception {
		if(head == -1) {
			throw new Exception("Can not get element from an empty Deque.");
		}
		return al.get(head);
	}
	
	public E peekFirst() throws Exception {
		if(head == -1) {
			return null;
		}
		return al.get(head);
	}
	
	public void addLast(E e) throws Exception {
		if(e == null) {
			throw new Exception("Data can not be null.");
		}
		if(head == -1) {
			al.add(e);
			head = tail = 0;
			return;
		}
		al.add(e);
		tail++;
	}
	
	public void offerLast(E e) throws Exception {
		addLast(e);
	}
	
	public E removeLast() throws Exception {
		if(head == -1) {
			throw new Exception("Can not remove element from an empty Deque.");
		}
		E toRemove = al.remove(tail);
		if(head == 0)
		    tail--;
		else
			head--;
		if(tail == -1) {
			head = -1;
		}
		return toRemove;
	}
	
	public E pollLast() {
		if(head == -1) {
			return null;
		}
		E toRemove = al.remove(tail);
		if(head == 0)
		    tail--;
		else
			head--;
		if(tail == -1) {
			head = -1;
		}
		return toRemove;
	}
	
	public E getLast() throws Exception {
		if(head == -1) {
			throw new Exception("Can not get element from an empty Deque.");
		}
		return al.get(tail);
	}
	
	public E peekLast() throws Exception {
		if(head == -1) {
			return null;
		}
		return al.get(tail);
	}
	
	public void print() {
		al.print();
	}
	
	public void add(E e) throws Exception {
		stack = false;
		addLast(e);
		queue = true;
	}
	
	public E remove() throws Exception {
		E ele = null;
		if(queue == true) {
			E toRemove = removeFirst();
			return toRemove;
		} else if(stack == true) {
			E toPop = removeLast();
			return toPop;
		}
		return ele;
	}
	
	public E element() throws Exception {
		E ele = null;
		if(queue == true) {
			E get = getFirst();
			return get;
		} else if(stack == true) {
			E toPeek = getLast();
			return toPeek;
		}
		return ele;
	}
	
	public void offer(E e) throws Exception {
		stack = false;
		offerLast(e);
		queue = true;
	}
	
	public E poll() throws Exception {
		E ele = null;
		if(queue == true) {
			E toRemove = pollFirst();
			return toRemove;
		} else if(stack == true) {
			E toPoll = pollLast();
			return toPoll;
		}
		return ele;
	}
	
	public E peek() throws Exception {
		E ele = null;
		if(queue == true) {
			E get = peekFirst();
			return get;
		} else if(stack == true) {
			E get = peekLast();
			return get;
		}
		return ele;
	}
	
	public void push(E e) throws Exception {
		queue = false;
		addLast(e);
		stack = true;
	}
	
	public E pop() throws Exception {
		E ele = null;
		if(stack == true) {
			E toPop = removeLast();
			return toPop;
		} else if(queue == true) {
			E toRemove = removeFirst();
			return toRemove;
		}
		return ele;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
