package list;

import java.util.Arrays;
import java.util.List;

public class ListReverse {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		reverseList(list);

		System.out.println(list);

	}

	private static void reverseList(List<Integer> list) {
		int start = 0;
		int end = list.size() - 1;

		while (start < end) {

			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);

			// move the pointer toward the center

			start++;
			end--;
		}

	}

}
