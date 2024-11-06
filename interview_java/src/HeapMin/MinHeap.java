package HeapMin;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinHeap {

	public static void main(String[] args) {
		// create a minHeap

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		minHeap.add(10);
		minHeap.add(1);
		minHeap.add(9);
		minHeap.add(8);
		minHeap.add(7);
		minHeap.add(6);
		minHeap.add(5);
		minHeap.add(3);
		minHeap.add(3);
		
		
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
		
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		
		  // Insert elements into the Max Heap
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(3);

        // Extract elements from the Max Heap
        System.out.println("Max Heap Elements:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // Poll removes the largest element
        }

	}

}
