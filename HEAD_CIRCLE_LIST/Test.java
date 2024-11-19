
public class Test {
	public static void main(String[] args) throws Exception{
		HeadCircleList list = new HeadCircleList();
		list.insert('B');
		list.insert('C');
		list.insert('D');
		list.insert('E');
		list.insert('F');
		list.display("Imprimir Lista");
		list.delete('D');
		list.insert_at_end('Z');
		list.display("Imprimir Lista");

	}
}