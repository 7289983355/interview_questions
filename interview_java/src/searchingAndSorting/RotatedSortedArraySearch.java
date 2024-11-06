package searchingAndSorting;

public class RotatedSortedArraySearch {
	
	
	public static int search(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if the target is present at mid
			if (arr[left] <= target && arr[mid] < target) {
				
			}
			
		
		}

		// Target was not found
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int result = search(nums, target);
		System.out.println("Target index: " + result);
	}
}
