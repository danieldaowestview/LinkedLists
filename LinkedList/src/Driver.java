
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Practice working with Node Objects
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		
		//link a to point to b;
		a.next = b;
		b.next = c;
		
		//Starting at a,
		// walk through every Node
		//print data
		Node curr = a;
		// curr starts at the beginning
		// of our "list"
		while(curr != null) {
			System.out.println(curr.getData());
			//our control variable should update
			//else loop never changes!
			//make curr point to the next node
			curr = curr.next; // the magic
		}
		
	}

}
