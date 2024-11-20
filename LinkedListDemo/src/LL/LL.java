package LL;

public class LL {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {

		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);

		head = one;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = null;

		Node five = new Node(5);
		insertAtLast(head, five);

		display(head);

	}

	private static void insertAtLast(Node head2, Node five) {

		Node temp = head2;

		while (temp != null && temp.next != null) {

			temp = temp.next;
		}

		if (temp != null) {

			temp.next = five;
		}

	}

	private static void display(Node head) {

		Node current = head;

		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}

		System.out.print("null");

	}

}
