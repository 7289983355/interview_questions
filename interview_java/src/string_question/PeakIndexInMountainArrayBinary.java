package string_question;

public class PeakIndexInMountainArrayBinary {

    public static void main(String[] args) {
        // Test cases
        testPeakIndex(new int[]{0, 2, 1, 0}, 1);
        testPeakIndex(new int[]{0, 1, 0}, 1);
        testPeakIndex(new int[]{0, 10, 5, 2}, 1);
        testPeakIndex(new int[]{1, 3, 8, 12, 4, 2}, 3);
        testPeakIndex(new int[]{3, 5, 3, 2, 0}, 1);
        testPeakIndex(new int[]{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0}, 5);
        testPeakIndex(new int[]{1, 2, 3, 4, 5, 6, 5}, 5);
        testPeakIndex(new int[]{1, 3, 2}, 1);
        testPeakIndex(new int[]{1, 2}, 1);
        testPeakIndex(new int[]{2, 1}, 0);
        testPeakIndex(new int[]{0}, 0);
    }

    private static void testPeakIndex(int[] arr, int expected) {
        int result = findPeakIndex(arr);
        System.out.printf("Input: %s, Expected: %d, Got: %d\n", arrayToString(arr), expected, result);
        assert result == expected : "Test failed for input: " + arrayToString(arr);
    }

    private static int findPeakIndex(int[] arr) {
    	
    	
		return 0;
    
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
