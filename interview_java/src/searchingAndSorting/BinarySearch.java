package searchingAndSorting;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 10, 40 };
		int target = 10;
		int result = binarySearch(arr, target);

		if (result == -1) {
			System.out.println("Element not found in array.");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}

	static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if the target is present at mid
			if (arr[mid] == target) {
				return mid;
			}
			// If target is greater, ignore the left half
			else if (arr[mid] < target) {
				left = mid + 1;
			}
			// If target is smaller, ignore the right half
			else {
				right = mid - 1;
			}
		}

		// Target was not found
		return -1;
	}
}
