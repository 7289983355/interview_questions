package list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);

		// Remove duplicates while preserving order
		List<Integer> uniqueList = removeDuplicates(list);

		// Print the list after duplicates are removed
		System.out.println(uniqueList);
	}

	private static List<Integer> removeDuplicates(List<Integer> list) {

		Set<Integer> set = new HashSet<>();

		for (Integer number : list) {

			if (set.contains(number)) {

				
			}
			
			
		}

		return null;
	}
}