package trees;

public class inorderPreorderTree {

	static int index = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inOrder = {4, 2, 1, 5, 3};
		int[] preOrder = {1, 2, 4, 3, 5};
		
		Node root = buildTree(inOrder, preOrder, 0, 4);
		inorderPrint(root);
	}

	static Node buildTree(int[] inOrder, int[] preOrder, int start, int end) {
		if(start > end) return null;
		int curr = preOrder[index];
		index++;
		Node node = new Node(curr);
		if(start == end) return node;
		int pos = search(inOrder, start, end, curr);
		node.left = buildTree(inOrder, preOrder, start, pos - 1);
		node.right = buildTree(inOrder, preOrder, pos + 1, end);
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
