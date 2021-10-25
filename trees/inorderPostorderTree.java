package trees;

public class inorderPostorderTree {

	static int index = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inOrder = {4, 2, 1, 5, 3};
		int[] postOrder = {4, 2, 5, 3, 1};
		Node root = buildTree(inOrder, postOrder, 0, 4);
		inorderPrint(root);
	}

	static Node buildTree(int[] inOrder, int[] postOrder, int start, int end) {
		if(start > end) return null;
		int curr = postOrder[index];
		index--;
		Node node = new Node(curr);
		if(start == end) return node;
		int pos = search(inOrder, start, end, curr);
		node.right = buildTree(inOrder, postOrder, pos + 1, end);
		node.left = buildTree(inOrder, postOrder, start, pos - 1);
		return node;
		
	}
	
	static int search(int[] inOrder, int start, int end, int curr) {
		for(int i = start; i <= end; i++) {
			if(inOrder[i] == curr) return i;
		}
		return -1;
	}
	
	static void inorderPrint(Node root) {
		if(root == null) return;
		inorderPrint(root.left);
		System.out.print(root.data + " ");
		inorderPrint(root.right);
	}
}
