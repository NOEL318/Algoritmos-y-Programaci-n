
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {
	char V;
	List<Node> childs_List;

	public Node(char v, Node[] child) {
		V = v;
		if (child != null) {
			childs_List = new ArrayList<>(Arrays.asList(child));
		} else {
			childs_List = new ArrayList<>();
		}
	}

	public void printAllNodes(Node root, int lvl) {
		System.out.println(" ".repeat(lvl * 2) + "- " + root.V);
		for (Node child : root.childs_List) {
			printAllNodes(child, lvl + 1);
		}
	}

}	