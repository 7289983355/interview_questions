package stringCoding_1;

public class SanitizeString {
	
	public static void main(String args[]) {
	String input = "Hello, World! 123.";
	String cleaned = input.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(cleaned);
	
}
}

