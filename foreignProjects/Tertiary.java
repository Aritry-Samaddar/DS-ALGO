package foreignProjects;

public class Tertiary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node = new Node(1);
		node.next1 = new Node(2);
		node.next1.next1 = new Node(3);
		node.next2 = new Node(4);
		node.next2.next1 = new Node(5);
		node.next2.next2 = new Node(6);
		
		BinaryNode nodes = fun(node);
		preOrder(nodes);
	}
	
	static BinaryNode fun(Node node) {
		if(node == null) return null;
		BinaryNode root = new BinaryNode(node.data);
		root.left = fun(node.next2);
		root.right = fun(node.next1);
		return root;
	}
	
	static void preOrder(BinaryNode root) {
		if(root == null) return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

}
class BinaryNode {
	int data;
	BinaryNode left;
	BinaryNode right;
	BinaryNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class Node {
	int data;
	Node prev;
	Node next1;
	Node next2;
	Node(int data) {
		this.data = data;
		this.prev = null;
		this.next1 = null;
		this.next2 = null;
	}
}