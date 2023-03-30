import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

	@Test
	void test() {
		// fail("Not yet implemented");
	}

	@Test
	void testSize() {
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
		System.out.println("Testing size():Check if size is 3 after adding 3 variables -> " + l.size());
	}

	@Test
	void testAdd() {
		SinglyLinkedList l = new SinglyLinkedList();
		int data = 1;
		Node n = new Node(data);
		data = 2;
		Node n1 = new Node(data);
		data = 3;
		Node n2 = new Node(data);
		l.add(n);
		//l.add(n1);
		//l.add(n2);
		System.out.println("Testing add(): Check if last element added was 1 -> " + l.toString());
		System.out.println("Testing size():Check if size is 1 after adding 1 variable -> " + l.size());
	}

	@Test
	void testRemove() {
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
		l.remove(2);
		System.out.println("Testing remove(): Check if element at 2 was removed -> " + l.toString());
	}
	@Test
	void testToString() {
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
		System.out.println("Testing toString(): Check if toString is [1, 2, 3] -> " + l.toString());
	}
	@Test
	void testGet() {
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
		System.out.println("Testing get(): Check if get(1) is 2 -> " + l.get(1).toString());
	}
}
