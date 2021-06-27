package trees;

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = null;
		root = insertBST(root, 5);
		insertBST(root, 1);
		insertBST(root, 3);
		insertBST(root, 4);
		insertBST(root, 2);
		insertBST(root, 7);
		
		inOrderBST(root);
	}

	static Node insertBST(Node root, int value) {
		if(root == null) return new Node(value);
		if(value < root.data) {
			root.left = insertBST(root.left, value);
		} else {
			root.right = insertBST(root.right, value);
		}
		return root;
	}
	
	static void inOrderBST(Node root) {
		if(root == null) return;
		inOrderBST(root.left);
		System.out.print(root.data + " ");
		inOrderBST(root.right);
	}
}

//class Node {
//	Node left, right;
//	int data;
//	public Node(int data) {
//		this.data = data;
//	}
//}