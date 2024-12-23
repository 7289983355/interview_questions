package stringCoding_1;

public class IndexOfOffsetExample {
	public static void main(String[] args) {
		String str = "Hello, World! Hello again!";

		// Find the index of 'o' starting from index 5
		int index = str.indexOf('o', 5);
		System.out.println("Index of 'o' after index 5: " + index); // Output: 8

		// Find the index of the second 'Hello'
		int secondHelloIndex = str.indexOf("Hello", 5);
		System.out.println("Index of second 'Hello': " + secondHelloIndex); // Output: 20
	}
}
