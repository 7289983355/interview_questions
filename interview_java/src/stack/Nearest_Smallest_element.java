package stack;

import java.util.Stack;
import java.util.Vector;

public class Nearest_Smallest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 5, 2, 10, 8 };

		smallestLeftElement(arr);
	}

	private static void smallestLeftElement(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length == 0) {
			System.out.println("Array is empty!!");
			return;
		}
		// create a stack and vector

		Vector<Integer> v = new Vector<>();
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && s.peek() >= arr[i]) {

				s.pop();

			}

			// stack is empty add -1 to the vector
			if (s.isEmpty()) {
				v.add(-1);
			} else {
				v.add(s.peek());
			}

			s.push(arr[i]);

		}

		System.out.println(v);

	}

}
