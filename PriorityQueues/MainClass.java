package PriorityQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
//		pq.add("kiwi");
//		pq.add("apple");
//		pq.add("mango");
//		pq.add("banana");
		
		
		pq.add(100);
		pq.add(12);
		pq.add(1);
		pq.add(45);
		
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());

	}

}
