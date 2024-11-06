package Recusion_And_BackTracking;

public class Checking_Array_is_Sorted {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 6, 9};  // Example array
        boolean isSorted = checkArraySorted(arr);
        System.out.println("Array is sorted: " + isSorted);
    }

    private static boolean checkArraySorted(int[] arr) {
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int i) {
        // Base case: if we reach the last element, return true
        if (i >= arr.length - 1) {
            return true;
        }
        
        // If the current element is greater than the next one, return false
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recur for the next element
        return helper(arr, i + 1);
    }
}
