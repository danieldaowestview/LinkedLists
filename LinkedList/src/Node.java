
public class Node<T> {
	private T data;
	Node next;
	
	//Add a parameterized constructor
	public Node(T data) {
		this.data = data;
		next = null;
	}
	// add getters and setters for data
	
	public T getData() {
		return this.data;
	}
	
	public Node getNext() {
		return next;
	}
	
}
