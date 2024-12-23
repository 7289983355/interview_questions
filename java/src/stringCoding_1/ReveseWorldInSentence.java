package stringCoding_1;

import java.util.Arrays;

public class ReveseWorldInSentence {

	public static void main(String[] args) {
		String sentence = "Hello World This is Java";
		String reversed = reverseWordsInSentence(sentence);
		System.out.println(reversed); // Output: "Java is This World Hello"
	}

	private static String reverseWordsInSentence(String sentence) {

		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length/2; i++) {

			String temp = words[i];
			words[i] = words[words.length-i - 1];
			words[words.length - 1-i] = temp;

		}
		return String.join(" ", words);
	}

}
