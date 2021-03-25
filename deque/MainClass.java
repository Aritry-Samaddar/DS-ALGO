package deque;

import java.util.ArrayDeque;
//import java.util.Deque;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Deque<Integer> ad = new ArrayDeque<>();
		ArrayDeque<Integer> ad = new ArrayDeque<>();
//		
//		ad.add(1);
//		ad.add(2);
//		ad.add(3);
//		System.out.println(ad.removeFirst());
		
		
		ad.push(1);
		ad.push(2);
		ad.push(3);
//		ad.pop();
		ad.pop();
		ad.pop();
		ad.pop();
		
		System.out.println(ad.element());
		
		
//		ad.addFirst(1);
//		ad.addFirst(2);
//		ad.pop();
//		System.out.println(ad.peek());
		
//		ad.push(1);
//		ad.push(2);
//		ad.push(3);
//		System.out.println(ad.pop());
//		System.out.println(ad.pop());
//		
//		ad.offerFirst(2);
//		ad.offerFirst(1);
//		System.out.println(ad.pollFirst());
//		System.out.println(ad.peekFirst());
		

	}

}
