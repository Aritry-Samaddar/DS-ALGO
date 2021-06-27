package trees;

import java.util.*;

public class lotSumAtK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 2;
		Node root = createTree();
		
		System.out.println(sumAtK(root, k));

	}
	
	static int sumAtK(Node root, int k) {
		if(root == null) return -1;
		Deque<Node> queue = new ArrayDeque<>();
		Node n = new Node(-1);
		queue.addLast(root);
		queue.addLast(n);
		int sum = 0;
		int level = 0;
		
		while(!queue.isEmpty()) {
			Node node = queue.removeFirst();
			if(node.data != -1) {
				if(level == k) sum += node.data;
				if(node.left != null) queue.addLast(node.left);
				if(node.right != null) queue.addLast(node.right);
			} else if(!queue.isEmpty()) {
				Node n1 = new Node(-1);
				queue.addLast(n1);
				level++;
			}
		}
		
		return sum;
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
