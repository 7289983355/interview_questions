package stringCoding_1;

public class RemoveDuplicate {

	public static void main(String[] args) {
		System.out.println(removeDuplicates("Dharmesesh")); // Output: "Dharmes"
	}

	private static String removeDuplicates(String str) {
		StringBuilder result = new StringBuilder();

		// Convert to lowercase for case-insensitive comparison
		String lowerStr = str.toLowerCase();

		for (char character : lowerStr.toCharArray()) {
			// Check if the character is already in the result
			if (result.indexOf("" + character) == -1) {
				result.append(character); // Append unique character
			}
		}

		return result.toString(); // Return the final string with duplicates removed
	}
}
