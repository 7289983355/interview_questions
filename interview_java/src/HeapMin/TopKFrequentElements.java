package HeapMin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//Steps to Solve the Problem

//Use a Min-Heap: Utilize a priority queue (min-heap) to keep track of the top K frequent elements.
//Return the Result: Extract the K elements from the heap.

public class TopKFrequentElements {

	public static void main(String[] args) {
		TopKFrequentElements solution = new TopKFrequentElements();
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		List<Integer> result = solution.topKFrequent(nums, k);
		System.out.println(result); // Output: [1, 2]
	}

	private List<Integer> topKFrequent(int[] nums, int k) {
		// Count Frequencies: Use a HashMap to count the frequency of each element.
		Map<Integer, Integer> mapOfInteger = new HashMap<>();
		for (int number : nums) {

			mapOfInteger.put(number, mapOfInteger.getOrDefault(number, 0) + 1);

		}

		// Create a priority queue add all the element and sort it By value

		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<Map.Entry<Integer, Integer>>(
				Map.Entry.comparingByValue());

		// add the Element to minHeap if size increase By 2 just pop

		for (Map.Entry<Integer, Integer> entry : mapOfInteger.entrySet()) {
			minHeap.offer(entry);

			if (minHeap.size() > 2) {
				minHeap.poll();
			}

		}
		// Return the Result: Extract the K elements from the heap.

		List<Integer> topK = new ArrayList<>();
		while(!minHeap.isEmpty()) {
		
		topK.add(minHeap.poll().getKey());
		}
		
		Collections.reverse(topK);
	
		return topK;
	}
}
