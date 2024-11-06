package stack;

import java.util.Stack;
import java.util.Vector;

public class Nearest_Greater_to_Left {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Stack<Integer> s = new Stack<>();

        int[] arr = { 1, 5, 3, 4 };

        // Traverse the array from the beginning to the end
        for (int i = 0; i < arr.length; i++) {
            // Pop elements from the stack that are less than or equal to the current element
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            // If the stack is empty, add -1 (no greater element on the left)
            if (s.isEmpty()) {
                v.add(-1);
            } else {
                // Otherwise, the top of the stack is the nearest greater element
                v.add(s.peek());
            }

            // Push the current element onto the stack for future comparisons
            s.push(arr[i]);
        }

        // Print the result
        System.out.println(v);
    }
}
