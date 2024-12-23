package linkedListDemo;

public class ReverseLinkedList {

	Node head;

	class Node {
		int data; // Value of the node
		Node next; // Reference to the next node

		// Constructor
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void insert(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;

		while (current.next != null) {

			current = current.next;

		}
		current.next = newNode;  //need to understand

	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();

		list.insert(1);
		list.insert(2);
		list.insert(3);

		System.out.println("Linked List:");
	}

}
