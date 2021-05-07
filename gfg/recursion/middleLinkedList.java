package gfg.recursion;

public class middleLinkedList {

	static SinglyLinkedListNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
		add(6);
		SinglyLinkedListNode temp = head;
		System.out.println(mid(temp, size(temp) / 2 + 1));

	}

	static int mid(SinglyLinkedListNode temp, int n) {
		if(n == 1) return temp.data;
		return mid(temp.next, n - 1);
	}
	
	static void add(int data) {
		SinglyLinkedListNode toAdd = new SinglyLinkedListNode(data);
		
		if(head == null) {
			head = toAdd;
			return;
		}
		
		SinglyLinkedListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	static int size(SinglyLinkedListNode temp) {
		if(temp == null) return 0;
		return size(temp.next) + 1;
	}
	
	static class SinglyLinkedListNode {
	    int data;
	    SinglyLinkedListNode next;
	    SinglyLinkedListNode(int data) {
	    	this.data = data;
	    	next = null;
	    }
	}
}
