package trees;

public class sumReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = createTree();
		System.out.println(sum(root));
		inOrder(root);
	}
	
	static void inOrder(Node node) {
		if(node == null) return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	static int sum(Node root) {
		if(root == null) return 0;
		root.data = sum(root.left) + sum(root.right) + root.data;
		return root.data;
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
