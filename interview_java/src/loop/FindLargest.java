package loop;


public class FindLargest {

    public static void main(String[] args) {
        // Sample array
        int[] arr = { 1, 3, 5, 7, 9 };
        // Call the findLargest method and print the result
        System.out.println("Largest element: " + findLargest(arr));
    }

    public static int findLargest(int[] arr) {
        // Check for empty array
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // Initialize max to the first element of the array
        int max = arr[0];

        // Loop through each element in the array
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
