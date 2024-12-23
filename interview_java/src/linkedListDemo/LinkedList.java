package linkedListDemo;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {

			this.data = data;
			this.next = null;
		}
	}

	public void add(int data) {

		Node newnode = new Node(data);

		if (head == null) {
			head = newnode;
			return;
		}

		Node current = head;

		while (current.next != null) {

			current = current.next; // ->A->B->C->D->null
		}
		current.next = newnode;

	}

	private void display() {

		Node current = head;

		while (current != null) {

			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

	 void remove(int data) {

		// if the head is matched
		if (head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;

		while (current.next != null) {

			if (current.next.data == data) {

				current.next = current.next.next;
				return;
			}
			current = current.next; // Move to the next node

		}

	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(10);

		list.add(20);
		list.add(30);
		list.display(); // Output: 10 -> 20 -> 30 -> null
		list.remove(30);
		System.out.println();
		list.display();
	}

}
