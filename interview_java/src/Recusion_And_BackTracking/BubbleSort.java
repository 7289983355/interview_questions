package Recusion_And_BackTracking;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println(Arrays.toString(arr));
	}

	private static int[] bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length-1 ; i++) {
			System.out.println("================================");

			for (int j = 0; j < arr.length-i-1; j++) {

				System.out.println("i :->" + arr[i] + "  j-> " + arr[j]);

				swap(arr, j, j+1);
			}

		}
		return arr;

	}

	private static int[] swap(int[] arr, int j, int k) {
		if (arr[j] > arr[k]) {

			int temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
		}
		return arr;
	}

}
