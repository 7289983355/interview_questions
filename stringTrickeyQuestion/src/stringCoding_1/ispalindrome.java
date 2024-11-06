package stringCoding_1;

//write a program to check a string is palindrome without reverse
public class ispalindrome {

	public static void main(String[] args) {
		String testString = "A man, a plan, a canal, Panama!";
		System.out.println(isPalindrome(testString));

	}

	private static boolean isPalindrome(String testString) {

		// Remove non-alphanumeric characters and convert to lowercase
		String cleanedStr = testString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int start = 0;
		int end = cleanedStr.length() - 1;

		while (start < end) {

			if (cleanedStr.charAt(start) != cleanedStr.charAt(end)) {

				return false;
			}

			start++;
			end--;
		}

		return true;
	}

}
