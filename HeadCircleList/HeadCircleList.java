public class HeadCircleList {
	private char info;
	private HeadCircleList link;

	public HeadCircleList() {
		link = this;
	}

	public void insert(char v) {
		HeadCircleList node = new HeadCircleList();
		node.info = v;
		node.link = link;
		this.link = node;
	}

	public void insert_at_end(char v) throws Exception {
		HeadCircleList node = new HeadCircleList();
		HeadCircleList prev = this, next = this.link;
		while (next != this) {
			prev = next;
			next = next.link;
		}
		prev.link = node;
		node.link = this;
		node.info = v;
	}

	public void insort(char v) throws Exception {
		HeadCircleList prev = this, next = this.link;
		if (prev == next) {
			throw new Exception("Error : Empty list");
		}
		HeadCircleList node = new HeadCircleList();
		while (next != this && (int) next.info >= (int) v) {
			prev = next;
			next = next.link;
		}
		node.info = v;
		prev.link = node;
		node.link = next;

	}

	public void display(String message) {
		System.out.println();
		System.out.println(message);
		HeadCircleList node = this.link;
		for (int i = 0; node != this; i++) {
			System.out.println(i + " : " + node.info);
			node = node.link;
		}
	}

	public void delete(char v) throws Exception {
		HeadCircleList prev = this, next = link;
		if (next == this) {
			throw new Exception("ERROR: Node Not Found");
		}
		while (next != this && next.info != v) {
			prev = next;
			next = next.link;
		}
		prev.link = next.link;
	}
}
