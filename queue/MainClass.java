package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		
//*		throws exception       *//
		
//		q.add(5);
//		q.add(10);
//		q.add(15);
//		
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		System.out.println(q.element());
//		
//		q.remove();
//		System.out.println(q.remove());
		
//*		returns null/false      *//
		
		q.offer(5);
		q.offer(10);
		q.offer(15);
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		q.poll();
		System.out.println(q.poll());

	}

}
