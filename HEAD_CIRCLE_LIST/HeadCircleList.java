
public class HeadCircleList{
	private char info;
	private HeadCircleList link;

	public HeadCircleList(){
		link=this;
	}
// TODO: Hacer para q inserte archivos al final del array

// <cmg "INSERT_UPSIDE.jpeg">
	public void insert(char v){
		HeadCircleList node= new HeadCircleList();
		node.info=v;
		node.link=link;
		this.link= node;
	}

	public void display(String message){
		System.out.println();
		System.out.println(message);
		HeadCircleList node= toString();
		for (int i = 0; node != ; i++) {
			
		}

	}
}