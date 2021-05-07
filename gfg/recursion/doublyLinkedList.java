package gfg.recursion;

public class doublyLinkedList {

	static DoublyLinkedListNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10);
		add(8);
		add(4);
		add(2);
		DoublyLinkedListNode temp = head;
		System.out.println(rev(temp, ""));

	}
	
	static String rev(DoublyLinkedListNode temp, String ans) {
		if(temp == null) return ans;
		ans = temp.data + " " + ans;
		return rev(temp.next, ans);
	}
	
	static void add(int data) {
		DoublyLinkedListNode toAdd = new DoublyLinkedListNode(data);
		if(head == null) {
			head = toAdd;
			return;
		}
		DoublyLinkedListNode temp = head;
		while(temp.next != null) {
			temp =  temp.next;
		}
		temp.next = toAdd;
		temp.next.prev = temp;
	}

	static class DoublyLinkedListNode {
		int data;
		DoublyLinkedListNode next;
		DoublyLinkedListNode prev;
		DoublyLinkedListNode(int data) {
			this.data = data;
			next = prev = null;
		}
	}
}
