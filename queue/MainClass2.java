package queue;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enQueue(5);
		mq.enQueue(10);
		mq.enQueue(15);
		mq.enQueue(20);
		
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.peek());
		mq.enQueue(50);
		System.out.println(mq.deQueue());
		
		mq.enQueue(60);
		mq.enQueue(70);
		mq.enQueue(80);
		
		System.out.println(mq.deQueue());
		System.out.println(mq.peek());
	}

}
