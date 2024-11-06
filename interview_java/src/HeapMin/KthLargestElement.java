package HeapMin;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		
		int [] arr= {2, 9, 4, 5, 6, 9, 8};
		int k=3;
		
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
       
       
        for(int number:arr) {
        	maxHeap.add(number);
        }
	
        
      for(int i=1 ;i<k;i++) {
    	  maxHeap.poll();
      }
      
      // The Kth largest element will now be at the top
      int kthLargest = maxHeap.poll();

      // Correct output message
      System.out.println(k + "th largest element is: " + kthLargest);
	}
	
	

}
