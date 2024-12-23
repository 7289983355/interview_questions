package JavaIIand17;

public class StringMethodsExample {
	public static void main(String[] args) {
		
		String str = "";

		// isBlank
		System.out.println("Is string blank? " + str.isBlank()); // Output: true

		// lines
		String multiLineStr = "Line 1\nLine 2\nLine 3";
		multiLineStr.lines().forEach(System.out::println); // Outputs each line separately

		// repeat
		String repeatedStr = "Hello ".repeat(3);
		System.out.println(repeatedStr); // Output: Hello Hello Hello
	}
}
