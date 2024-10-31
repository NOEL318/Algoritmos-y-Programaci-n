public class Test {

	public static void main(String[] args) {
		BinaryTree bin_tree = new BinaryTree('-',
				new BinaryTree('*', new BinaryTree('a', null, null), new BinaryTree('b', null, null)),
				new BinaryTree('+', new BinaryTree('c', null, null),
						new BinaryTree('^', new BinaryTree('d', null, null), new BinaryTree('e', null, null))));

		bin_tree.inorder();
	}

}