package tree_level_1;

public class BinaryTree {

	// Root of the binary tree
	Node root;

	// Constructor to initialize an empty tree
	BinaryTree() {
		root = null;
	}

	// Method to insert a new node in the binary tree
	public void insert(int data) {
		root = insertRec(root, data);
	}

	// Recursive function to insert a new node with given data
	private Node insertRec(Node root, int data) {
		// If the tree is empty, return a new node
		if (root == null) {
			root = new Node(data);
			return root;
		}

		// Otherwise, recur down the tree
		if (data < root.data) {
			root.left = insertRec(root.left, data); // Insert in the left subtree if data is smaller
		} else if (data > root.data) {
			root.right = insertRec(root.right, data); // Insert in the right subtree if data is greater
		}

		// Return the unchanged node pointer
		return root;
	}

	// Method to do inorder traversal of the tree
	public void inorder() {
		inOrderRec(root);
	}
//  50
///     \
//30       70
///  \     /  \
//20 40    60   80

	// Recursive function for inorder traversal
	private void inOrderRec(Node root) {
		if (root != null) {
			inOrderRec(root.left); // Traverse left subtree
			System.out.print(root.data + " "); // Visit node
			inOrderRec(root.right); // Traverse right subtree
		}
	}

	public static void main(String[] args) {
		// Create an object of BinaryTree
		BinaryTree tree = new BinaryTree();

		// Insert nodes into the binary tree
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		// Print inorder traversal of the binary tree
		System.out.println("Inorder traversal:");
		tree.inorder(); // Expected output: 20 30 40 50 60 70 80
		System.out.println();
	}
}
