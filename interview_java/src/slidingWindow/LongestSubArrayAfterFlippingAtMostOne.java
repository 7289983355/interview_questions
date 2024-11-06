package slidingWindow;

public class LongestSubArrayAfterFlippingAtMostOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = { 1, 0, 1, 1, 0, 1, 1 };
	//	int[] arr = {1, 0, 1, 1, 0, 1, 1};
		int[] arr = {1, 0, 0, 1, 1, 0, 1};

		


		int start = 0;
		int zerosCount = 0;
		int max_Length = 0;

		for (int end = 0; end < arr.length; end++) {

			if (arr[end] == 0) {
				zerosCount++;
			}

			// Adjust the start index when we have more than one zero
            while (zerosCount > 1) {
                if (arr[start] == 0) {
                    zerosCount--;
                }
                start++;
            }

			max_Length = Math.max(max_Length, end - start + 1);
		}

		System.out.println("max_Length :" +max_Length);
	}

}
