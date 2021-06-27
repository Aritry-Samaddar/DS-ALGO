package trees;

public class heightAndDiameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(diameter(createTree()));
		Height height = new Height();
		System.out.println(diameters(createTree(), height));
	}

	static int height(Node root) {
		if(root == null) return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}
	
	static int diameter(Node root) {
		if(root == null) return 0;
		int currDiameter = height(root.left) + height(root.right) + 1;
		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);
		return Math.max(currDiameter, Math.max(leftDiameter, rightDiameter));
	}
	
	/* optimized-----> */
	static int diameters(Node root, Height height) {
		Height leftHeight = new Height();
		Height rightHeight = new Height();
		if(root == null) {
			height.h = 0;
			return 0;
		}
		int leftDiameter = diameters(root.left, leftHeight);
		int rightDiameter = diameters(root.right, rightHeight);
		height.h = Math.max(leftHeight.h, rightHeight.h) + 1;
		return Math.max(leftHeight.h + rightHeight.h + 1, Math.max(leftDiameter, rightDiameter));
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
 class Height {
	 int h;
 }