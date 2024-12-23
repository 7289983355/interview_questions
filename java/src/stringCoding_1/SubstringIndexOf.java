package stringCoding_1;

public class SubstringIndexOf {
	public static void main(String[] args) {
		String str = "Programming in Java is fun!";

		// Find the index of the substring "Java"
		int index = str.indexOf("Java");
		System.out.println("Index of 'Java': " + index); // Output: 15

		// Find the index of a substring that is not present
		int notFoundIndex = str.indexOf("Python");
		System.out.println("Index of 'Python': " + notFoundIndex); // Output: -1
	}
}
