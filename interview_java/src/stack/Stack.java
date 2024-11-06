package stack;

public class Stack {

	ListNode listNode;
	static int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data = 10;
		push(data);

	}

	private static void push(int data) {
		// TODO Auto-generated method stub

		ListNode lst = new ListNode();

		lst.data = data;

		lst.next = null;
		length++;

	}

}

class ListNode {

	int data;
	ListNode next;
}
