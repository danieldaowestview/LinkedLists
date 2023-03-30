import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	void testReverse() {
		SinglyLinkedList l = new SinglyLinkedList();
		int data = 1;
		Node n = new Node(data);
		data = 2;
		Node n1 = new Node(data);
		data = 3;
		Node n2 = new Node(data);
		l.add(n);
		l.add(n1);
		l.add(n2);
		ReverseLinkedList.reverse(l);
		System.out.println("Check if [1, 2, 3] has been reversed" + l);
		
	}

}
