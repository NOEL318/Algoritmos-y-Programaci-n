public class Test {
	public static void main(String[] args) {
		Node root = new Node('a', new Node[] { new Node('b', new Node[] { new Node('c', null),
				new Node('d', new Node[] { new Node('f', null), new Node('g', null) }), new Node('e', null) }) });
		System.out.println("Root node: " + root);
		root.printAllNodes(root, 0);
	}
}


















// public class Test {
// public static void main(String[] args) {
// // Root node:
// Node RN = new Node('a');
// Node SN = new Node('b');
// Node TN = new Node('c');

// Node FN = new Node('d');
// Node FFTN = new Node('e');
// Node SXN = new Node('f');
// Node SVN = new Node('g');
// // a>b
// RN.addChild(SN);
// // B>C && B>D && B>E
// SN.addChild(TN);
// SN.addChild(FN);
// SN.addChild(FFTN);
// // D>F&& D>G
// FN.addChild(SXN);
// FN.addChild(SVN);

// }
// }

// public class Test {
// // Método para imprimir el árbol

// public static void printTree(Node node, String prefix) {
// if (node == null)
// return;
// System.out.println(prefix + node.data);
// for (Node child : node.children) {
// printTree(child, prefix + " ");
// }
// }

// public static void main(String[] args) {
// // Crear los nodos del árbol
// Node a = new Node('a');
// Node b = new Node('b');
// Node c = new Node('c');
// Node d = new Node('d');
// Node e = new Node('e');
// Node f = new Node('f');
// Node g = new Node('g');

// // Construir el árbol según la estructura de la imagen
// a.addChild(b); // a -> b
// b.addChild(c); // b -> c
// b.addChild(d); // b -> d
// b.addChild(e); // b -> e
// d.addChild(f); // d -> f
// d.addChild(g); // d -> g

// // Imprimir el árbol
// System.out.println("Árbol:");
// printTree(a, "");
// }
// }
