package array;

public class MaxAmountOfWaterInAContainer {

	public static void main(String[] args) {

		MaxAmountOfWaterInAContainer solution = new MaxAmountOfWaterInAContainer();
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("Max Area: " + solution.maxAmountOfWaterInAContainer(height)); // Output should be 49

	}

	private int maxAmountOfWaterInAContainer(int[] height) {

		int maxArea = 0;
		int currentArea = 0;

		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {

				// Correct width calculation
				int width = j - i;
				// Use the minimum height for calculation
				currentArea = Math.min(height[i], height[j]) * width;

				maxArea = Math.max(currentArea, maxArea);

			}
		}
		return maxArea;
	}

}
