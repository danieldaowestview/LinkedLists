
public class ReverseLinkedList {

	public static void reverse(SinglyLinkedList list) {
		Node prev = null;
		Node curr = list.head;
		Node next = null;
		while (curr.next != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
	}
}
