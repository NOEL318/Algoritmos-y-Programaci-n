public class HeadCircleList{
	private char info;
	private HeadCircleList link;

	public HeadCircleList(){
		link=this;
	}

	public void insert(char v){
		HeadCircleList node= new HeadCircleList();
		node.info=v;
		node.link=link;
		this.link= node;
	}

	public void insert_at_end(char v) throws Exception{
		HeadCircleList node=new HeadCircleList();
		HeadCircleList prev=this, next=this.link;
		while (next!=this) {
			prev=next;
			next=next.link;
		}
		prev.link = node;
    node.link = this;
		node.info=v;
	}

	public void display(String message){
		System.out.println();
		System.out.println(message);
		HeadCircleList node= this.link;
		for (int i = 0; node != this; i++) {
			System.out.println(i+ " : "+ node.info);
			node=node.link;
		}
	}

	public void delete(char v) throws Exception{
		HeadCircleList prev=this, next=link;
		while (next!=this && next.info!=v) {
			prev=next;
			next=next.link;
		}
		if (next==this) {
		throw new Exception("ERROR: Node Not Found");
		}
		prev.link=next.link;
	}
}