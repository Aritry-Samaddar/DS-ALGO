package trees;

import java.util.*;

public class lotSumAtK {

	static Scanner sc = new Scanner(System.in);
	static int k = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Node> queue = new ArrayDeque<>();
		Node root = createTree();
		Node n = new Node(-1);
		queue.addLast(root);
		queue.addLast(n);
		int sum = 0;
		
		while(queue.size() > 1 && k >= 0) {
			if(queue.size() == 1) break;
			Node node = queue.removeFirst();
			if(node.data == -1) {
				Node n1 = new Node(-1);
				queue.addLast(n1);
				k--;
				if(k >= 0) sum = 0;
			}
			if(node.data != -1 || node.left != null || node.right != null) {
				if(node.left != null) queue.addLast(node.left);
				if(node.right != null) queue.addLast(node.right);
				sum += node.data;
			}
		}
		
		System.out.println(sum);
	}
	
	static Node createTree() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		return root;
	}
}
