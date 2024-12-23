package slidingWindow;

import java.util.Arrays;

public class FindTheWindowWhichSumTheTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 5, 2, 3, 1, 4, 5, 2, 3, 6 };

		int target = 10;
		int k = 3;
		System.out.println(Arrays.toString(findTheWindowWhichSumTheTarget(arr, k, target)));

	}

	 private static int[] findTheWindowWhichSumTheTarget(int[] arr, int k, int target) {

		// TODO Auto-generated method stub
		int start = 0;
		int end = 0;
		int currentSum = 0;
		int maxSum = 0;

		// calculate the sum of first k element
		while (end < k) { // 0,1,2
			currentSum = currentSum + arr[end];
			end++;
		}
		if(currentSum==target) {
			
			   return new int[] { start,start + 1, end };
			}
		

		maxSum = currentSum;

		// calculate for the sum sliding the window
		while (end < arr.length) { // 3 ,4,5,
			currentSum = currentSum + arr[end] - arr[start];
			maxSum = Math.max(maxSum, currentSum);
			
			if(maxSum==target) {
				
			   return new int[] { start,start + 1, end };
			}
			end++;
			start++;

		}
		return arr;
	}

}
