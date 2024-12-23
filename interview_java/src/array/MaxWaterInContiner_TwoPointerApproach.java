package array;

public class MaxWaterInContiner_TwoPointerApproach {

	public static void main(String[] args) {
		MaxWaterInContiner_TwoPointerApproach solution = new MaxWaterInContiner_TwoPointerApproach();
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("Max Area: " + solution.maxWaterInContiner_TwoPointerApproach(height)); // Output should be
																									// 49

	}

	private int maxWaterInContiner_TwoPointerApproach(int[] height) {

		int start = 0;
		int end = height.length - 1;
		int maxArea = 0;

		while (start < end) {

			int width = end - start;
			int currentArea = Math.min(height[start], height[end]) * width;

			maxArea = Math.max(maxArea, currentArea);

			if (height[start] < height[end])
			{
				start++;
			}else {
				  end--;
			}
			  

		}

		return maxArea;
	}

}
