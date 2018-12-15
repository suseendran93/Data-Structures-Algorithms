package datastructures;

public class BinaryTreePractice {
	Node root;

	BinaryTreePractice() {
		root = null;
	}

	void traverse(Node root) {

		traverseInOrder(root);
	}

	void traverseInOrder(Node root) {
		if(root==null)
		return;
		
		traverseInOrder(root.left);//Recursion
		System.out.println(root.key);
		traverseInOrder(root.right);//Double recursion
		

	}

	void insert(int key) {
		root = insertNode(root, key);
	}

	Node insertNode(Node root, int item) {
		if (root == null) {
			root = new Node(item);
			return root;
		}

		if (root.key > item)
			root.left = insertNode(root.left, item);// Recursion

		else if (root.key < item)
			root.right = insertNode(root.right, item);// Recursion

		return root;

	}

	static class Node {
		int key;
		Node left, right = null;

		public Node(int key) {
			this.key = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreePractice bitp = new BinaryTreePractice();
		bitp.insert(5);
		bitp.insert(8);
		bitp.insert(1);
		bitp.insert(9);
		bitp.insert(4);
		bitp.insert(0);
		bitp.insert(7);

		bitp.traverse(bitp.root);

	}


}
