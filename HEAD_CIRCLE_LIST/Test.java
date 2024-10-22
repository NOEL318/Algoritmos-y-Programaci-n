import java.utils.List;
import java.utils.LinkedList;

public class Test{
	public static void main(String[] args){
		List list= new LinkedList();
		HeadCircleList list= new HeadCircleList();
		list= list.insert("B");
		list= list.insert("C");
		list= list.insert("D");
		list= list.insert("E");
		list= list.insert("F");

		list.display("Imprimir Lista");
	}
}