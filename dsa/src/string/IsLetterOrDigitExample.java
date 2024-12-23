package string;

public class IsLetterOrDigitExample {
	public static void main(String[] args) {
		char[] testChars = { 'A', 'b', '1', '!', ' ' };

		for (char ch : testChars) {
			if (Character.isLetterOrDigit(ch)) {
				System.out.println(ch + " is a letter or digit.");
			} else {
				System.out.println(ch + " is NOT a letter or digit.");
			}
		}
	}
}
