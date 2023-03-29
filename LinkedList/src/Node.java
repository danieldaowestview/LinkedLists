
public class Node<T> {
	private T data;
	Node next;

	// Add a parameterized constructor
	public Node(T data) {
		this.data = data;
		next = null;
	}
	// add getters and setters for data

	public T getData() {
		return this.data;
	}

	public void setData(T t) {
		this.data = t;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node t) {
		this.next = t;
	}

}
