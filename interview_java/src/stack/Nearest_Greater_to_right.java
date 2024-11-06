package stack;
import java.util.Stack;
import java.util.Vector;

public class Nearest_Greater_to_right {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Stack<Integer> s = new Stack<Integer>();

		int[] arr = { 1, 2, 3, 4 };

		// Traverse the array from the end to the beginning
		for (int i = arr.length - 1; i >= 0; i--) {

			// Pop elements from the stack while they are less than or equal to arr[i]
			while (!s.isEmpty() && s.peek() <= arr[i]) {
				s.pop();
			}

			// If stack is empty, add -1, otherwise add the top element
			if (s.isEmpty()) {
				v.add(-1);
			} else {
				v.add(s.peek());
			}

			// Push the current element onto the stack
			s.push(arr[i]);
		}

		// Since we've built the vector in reverse order, we need to reverse it before
		// printing
		Vector<Integer> result = new Vector<Integer>();
		for (int i = v.size() - 1; i >= 0; i--) {
			result.add(v.get(i));
		}

		System.out.println(result);
	}
}
