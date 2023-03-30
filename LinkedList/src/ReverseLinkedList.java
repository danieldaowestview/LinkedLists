
public class ReverseLinkedList {

	public static void reverse(SinglyLinkedList list) {
		Node prev = null;
		Node curr = list.get(0);
		Node next = list.get(0);
		while (curr.getNext() != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
	}
}
