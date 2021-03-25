package queue;

import lists.arrayLists.MyArrayList;

public class MyQueue2<E> {
	
	private MyArrayList<E> al = new MyArrayList<>();
//	private E rear = al.get(al.size() - 1);/ al.getLast();
	private E rear = al.last();
	
	public void add(E e) {
		al.add(e);
	}
	
	public void offer(E e) {
		al.add(e);
	}
	
	public E poll() throws Exception {
		if(al.isEmpty()) {
			return null;
		}
		E item = al.get(0);
		al.remove(0);
		return item;
	}
	
	public E remove() throws Exception {
		if(al.isEmpty()) {
			throw new Exception("Removing element from an empty Queue.");
		}
		E item = al.get(0);
		al.remove(0);
		return item;
	}
	
	public E peek() throws Exception {
		if(al.isEmpty()) {
			return null;
		}
		return al.get(0);
	}
	
	public E element() throws Exception {
		if(al.isEmpty()) {
			throw new Exception("Peeking element from an empty Queue.");
		}
		return al.get(0);
	}
	
	public int QueueSize() {
		return al.size();
	}
	
	public boolean IsEmptyQueue() {
		return al.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
