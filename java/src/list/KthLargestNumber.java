package list;

import java.util.Arrays;
import java.util.List;

public class KthLargestNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
		int k = 3;

		// Sort the list in descending order
		numbers.sort((a, b) -> b - a);

		System.out.println("The " + k + "th largest number is " + numbers.get(k));
	}

}
