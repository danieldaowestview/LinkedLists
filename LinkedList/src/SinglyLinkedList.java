public class SinglyLinkedList {
	Node head;
	private int size;

	public SinglyLinkedList() {
		/* to be completed by student */
		this.head = null;
		this.size = 0;
	}

	public int size() {
		return size;
	}

	public String toString() {
		/* to be completed by student */
		String result = "[";
		Node curr = head;
		while (curr != null && curr.getNext() != null) {
			result += curr.getData().toString() + ", ";
			curr = curr.getNext();
		}
		if (curr != null) {
			result += curr.getData().toString();
		}
		result += "]";
		return result;
	}

	public Node remove(int n) {
		/* to be completed by student */
		// if (n >= size || n < 0) {
		// throw new IndexOutOfBoundsException();
		// }
		Node curr = head;
		for (int i = 0; i < n - 1; i++) {
			curr = curr.getNext();
		}
		Node node = curr.getNext();
		curr.setNext(curr.getNext().getNext()); // for loop goes up to n - 1 index,
		// and sets the pointer to the n + 1 node
		size--;
		return node;
	}///

	public void add(Node n) {
		/* to be completed by student */
		size++;
		Node curr = head;
		if (head == null) {
			head = n;
		} else {
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(n);
		}
	}
	public Node get(int index){
	    Node curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.getNext();
        }
	    return curr;
	}
}