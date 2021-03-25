package lists.linkedLists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> l = new MyLinkedList();
		MyLinkedList<String> ll = new MyLinkedList();
		MyLinkedList<String> lll = new MyLinkedList();
		MyLinkedList<Integer> llll = new MyLinkedList();
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);
//		ll.add("ari");
//		ll.add("adi");
		l.add(1);
		l.add(2);
		l.add(3);
//		
//		lll.add("a");
//		lll.add("b");
//		lll.add("c");
//		
		ll.add("ari");
		ll.add("adi");
		ll.add("debu");
		
//		System.out.println(ll.contains("oreo"));
		ll.insert(2, "oreo");
		ll.print();
		System.out.println();
		l.insert(1, 5);
		l.print();
		llll.add(1);
		llll.add(2);
		llll.add(3);
//		ll.removeAll();
//		ll.add("oreo");
//		ll.print();
//		llll.addAll(l);
//		llll.print();
		
//		ll.remove(0);
//		ll.print();
//		System.out.println(ll.size());
//		System.out.println(ll.get(1));
		
//		l.addAll(lll);
//		l.print();
//		System.out.println();
//		System.out.println(lll.get(1));
//		
//		ll.set(0, "oreo");
//		ll.print();
		
		
		
//		for(int i = 0; i < 10; i++) {
//			ll.add(i + "added");
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			l.add(i);
//		}
//		
//		ll.print();
//		System.out.println();
//		l.print();
		
		// TODO Auto-generated method stub
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		
//		
//		getTimeDiff(al);
//		getTimeDiff(ll);
////		ll.add(12);
////		ll.add(10);
////		ll.add(32);
////		System.out.println(ll);
////		System.out.println(ll.get(1));
////		Object[] ans = ll.toArray();
////		for(Object e : ans) {
////			System.out.print(e + " ");
////		}
////		System.out.println();
////		ll.set(2, 5);
////		System.out.println(ll);
//
	}
//	static void getTimeDiff(List<Integer> list) {
//		
//		long start = System.currentTimeMillis();
//		for(int i = 0; i < 100000; i++) {
////			list.add(i);
//			list.add(0, i);
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName() + "-->" + (end - start));
//	}

}
