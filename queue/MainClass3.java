package queue;

public class MainClass3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MyQueue2<Integer> queue = new MyQueue2<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());

	}

}
