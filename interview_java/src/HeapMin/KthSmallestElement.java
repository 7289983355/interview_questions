package HeapMin;

import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {
		
		int [] arr= {2, 9, 4, 5, 6, 9, 8};
		int k=3;
		
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
       
       
        for(int number:arr) {
        	minHeap.add(number);
        }
	
        
      for(int i=1 ;i<k;i++) {
    	  minHeap.poll();
      }
      
      // The Kth smallest element will now be at the top
      int kthSmallest = minHeap.poll();

      System.out.println(k + "th smallest element is: " + kthSmallest);

	}
	
	

}
