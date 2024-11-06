package HeapMin;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PriorityQueue_1 {

	public static void main(String[] args) {

		// We have a Frequency Map
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		frequencyMap.put(1, 3); // 1 appears 3 times
		// frequencyMap.put(2, 2); // 2 appears 2 times
		frequencyMap.put(3, 1); // 3 appears 1 time
		frequencyMap.put(2, 2); // 2 appears 2 times
		// Sort the map based on Key

		List<Map.Entry<Integer, Integer>> sortedByValue = frequencyMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
		;
		System.out.println("By value");

		sortedByValue.forEach(entry -> System.out.println(entry.getKey() + "  -> " + entry.getValue()));

		List<Map.Entry<Integer, Integer>> sortedByKey = frequencyMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
		;
		System.out.println("By Key");

		sortedByKey.forEach(entry -> System.out.println(entry.getKey() + "  -> " + entry.getValue()));

	}
}
