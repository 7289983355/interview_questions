package stack;

public class StackDemo {

    static int size;
    static ListNode top;

    static class ListNode {  // Make ListNode static to avoid needing StackDemo instance

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;  // Corrected assignment
        }
    }

    public static void main(String[] args) {
        push(10);
        // You can add more operations to test the stack
        push(20);
        System.out.println(pop()); // Should print 20
        System.out.println(pop()); // Should print 10
    }

    public static void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        size++;
    }

    public static int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    public static int size() {
        return size;
    }
}
