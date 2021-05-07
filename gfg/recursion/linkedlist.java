package gfg.recursion;

import java.util.*;

import lists.linkedLists.MyLinkedList.Node;

public class linkedlist {

	static SinglyLinkedListNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<>();
		Add(9);
		Add(8);
		Add(3);
		Add(5);
		Add(2);
		Add(1);
        SinglyLinkedListNode temp = head;
        int k = 4;
        fun(temp, k);
        while(head != null) {
        	System.out.print(head.data + " ");
        	head = head.next;
        }

	}
	
	static void fun(SinglyLinkedListNode ll, int k) {
		if(ll == null) return;
		if(k < 1) {
			ll = ll.next;
			return;
		}
		if(k == 2) {
			ll.next = ll.next.next;
			return;
		}
		fun(ll.next, k - 1);
	}
	
	public static void Add(int data) {
		SinglyLinkedListNode toAdd = new SinglyLinkedListNode(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		SinglyLinkedListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}

	public static boolean isEmpty() {
		return head == null;
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


