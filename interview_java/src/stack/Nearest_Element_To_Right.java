package stack;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class Nearest_Element_To_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 5, 3, 4 };
		nearestElementToRight(arr);

	}

	private static void nearestElementToRight(int[] arr) {
		// check for empty case
		if (arr.length == 0) {
			System.out.println("Array is Empty !!");
			return;
		}
		Vector<Integer> v = new Vector<>();
		Stack<Integer> s = new Stack<>();

		for (int i = arr.length - 1; i >= 0; i--) {

			while (!s.empty() && s.peek() >= arr[i]) {
				s.pop();
			}
			if (s.empty()) {
				v.add(-1);
			} else {
				v.add(s.peek());
			}

			s.push(arr[i]);
		}
		Collections.reverse(v);

		System.out.println(v);
	}

}
