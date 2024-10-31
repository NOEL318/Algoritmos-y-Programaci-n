public class BinaryTree {

	private char info;
	// pointers==NULL
	private BinaryTree left;
	private BinaryTree right;

	// Constructor that implements acepted values from main to BinaryTree class
	public BinaryTree(char c, BinaryTree l, BinaryTree r) {
		info = c;
		left = l;
		right = r;
	}

	public void inorder() {
		if (left != null) {
			left.inorder();
		}
		System.out.print(info + " ");
		if (right != null) {
			right.inorder();
		}
	}

	public void display() {
		
	}

}