package trees;

import java.util.*;

public class levelOrder {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Node> queue = new ArrayDeque<>();
		Node root = createTree();
		Node n = new Node(-1);
		queue.addLast(root);
		queue.addLast(n);
		LOT(queue);
	}

	static void LOT(Deque<Node> queue) {
		if(queue.size() == 1) return;
		Node node = queue.removeFirst();
		if(node.data == -1) {
			Node n = new Node(-1);
			queue.addLast(n);
		}
		if(node.data != -1 || node.left != null || node.right != null) {
			if(node.left != null) queue.addLast(node.left);
			if(node.right != null) queue.addLast(node.right);
			System.out.print(node.data + " ");
		}
		LOT(queue);
	}
	
	static Node createTree() {
		Node root = null;
		System.out.println("Enter the data : ");
		int data = sc.nextInt();
		if(data == -1) return root;
		root = new Node(data);
		System.out.println("Enter left for " + data);
		root.left = createTree();
		System.out.println("Enter right for " + data);
		root.right = createTree();
		return root;
	}
}
