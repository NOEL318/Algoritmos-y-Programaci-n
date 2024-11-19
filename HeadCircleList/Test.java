public class Test {
	public static void main(String[] args) throws Exception {
		HeadCircleList list = new HeadCircleList();
		list.insert('A');
		list.insert('B');
		list.insert('D');
		list.insert('E');
		list.display("Insertando A B D E");
		list.insort('C');
		list.display("Insertando C con insort");
		list.insort('G');
		list.display("Insertando G con insort");
		list.insert_at_end('Z');
		list.display("Insertando Z con insend");
		list.insert_at_end('M');
		list.display("Insertando M con insend");

		list.delete('E');
		list.delete('Z');
		list.display("Borrando E");
		list.display("Borrando Z");
	}
}
