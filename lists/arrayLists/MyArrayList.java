package lists.arrayLists;

public class MyArrayList<E> {
	private int loc = 0;
	private int size = 1;
	private E last;
	private Object[] array = new Object[size];
	
	private void newArray() {
		size *= 2;
		Object[] Array = new Object[size];
		for(int i = 0; i < array.length; i++) {
			Array[i] = array[i];
		}
		array = Array;
	}
	
	public void add(E e) {
		if(loc == size) {
			newArray();
		}
		array[loc] = e;
		last = e;
		loc++;
	}
	
	public E last() {
		if(isEmpty()) return null;
		return last;
	}
	
	public int size() {
		int count = 0;
		for(int i = 0; i < loc; i++) {
			count++;
		}
		return count;
	}
	
	public void print() {
		for(int i = 0; i < loc; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	void set(int index, E e) throws Exception {
		if(index > loc - 1) {
			throw new Exception("Index is out of bound");
		}
		array[index] = e;
	}
	
	public E get(int index) throws Exception {
		if(index > loc - 1) {
			throw new Exception("Index is out of bound");
		}
		return (E) array[index];
	}
	
	void addAll(MyArrayList<E> e) throws Exception {
		int i = 0;
		while(i < e.loc) {
			if(loc == size) {
				newArray();
			}
			array[loc] = e.get(i);
			i++;
			loc++;
		}
	}
	
	public E remove(int index) {
		E toRemove = (E) array[index];
		for(int i = index; i < loc - 1; i++) {
			array[i] = array[i + 1];
		}
		loc--;
		return toRemove;
	}
	
	void removeAll(MyArrayList<E> e) throws Exception {
		for(int i = 0; i < e.size(); i++) {
			if(has(e.get(i))) {
				for(int j = 0; j < size(); j++) {
					if(array[j] == e.get(i)) {
						remove(j);
						break;
					}
					continue;
				}
			}
			continue;
		}
	}
	
	boolean has(E e) {
		for(int i = 0; i < size(); i++) {
			if(array[i] == e) {
				return true;
			}
			continue;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(loc == 0) return true;
		return false;
	}
	
	void clear() {
		loc = 0;
		size = 1;
		Object[] array = new Object[size];
		this.array = array;
	}
	
	Object[] toArray() {
		Object[] newArr = new Object[size()];
		for(int i = 0; i < size(); i++) {
			newArr[i] = array[i];
		}
		return newArr;
	}
	
	void toArray(E[] e) {
		for(int i = 0; i < size(); i++) {
			e[i] = (E) array[i];
		}
	}
	
	public E removeLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("Can not remove last element from empty array list.");
		}
		E item = (E) array[loc - 1];
		loc--;
		return item;
	}
	
	public E getLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("Can not peek last element from empty array list.");
		}
		return (E) array[loc - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
