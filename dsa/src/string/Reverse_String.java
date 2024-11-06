package string;

import java.util.Arrays;

public class Reverse_String {

	public static void main(String[] args) {

		String[] charArr = { "h", "e", "l", "l", "o" };
		System.out.println(Arrays.toString(reverseString(charArr)));
	}

	private static String[] reverseString(String[] charArr) {

		int start = 0;
		int end = charArr.length-1;

		while (start < end) {
			String temp = charArr[start];
			charArr[start] = charArr[end];
			charArr[end] =temp;
			
			start++;
			end--;
		}

		return charArr;

	}

}
