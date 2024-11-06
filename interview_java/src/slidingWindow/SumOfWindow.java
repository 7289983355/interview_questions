package slidingWindow;

public class SumOfWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Window size
		int k = 3;

		// Input array
		int[] arr = new int[] { 1, 2, 3, 1, 4, 5, 2, 3, 6 };

		sumofWindowSizeK(arr, k);
	}

	private static void sumofWindowSizeK(int[] arr, int k) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 0;
		int currentSum = 0;
		int maxSum = 0;

		// calculate the sum of first k element
		while (end < k) { //0,1,2
			currentSum = currentSum + arr[end];
			end++;
		}

		maxSum = currentSum;

		//calculate for the sum sliding the window
		while (end < arr.length) { //3 ,4,5,
			currentSum = currentSum + arr[end]- arr[start] ;
			maxSum = Math.max(maxSum, currentSum);
			end++;
			start++;
			
		}

		System.out.println(maxSum);
	}

}
