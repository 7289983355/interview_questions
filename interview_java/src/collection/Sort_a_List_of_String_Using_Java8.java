package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_a_List_of_String_Using_Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("YELLOW","RED", "BLUE", "GREEN");

		List<Integer> sortedList = list.stream().map(s -> s.length()).sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());

		System.out.println(sortedList);

	}

}
