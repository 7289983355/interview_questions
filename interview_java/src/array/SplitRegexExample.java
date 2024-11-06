package array;

public class SplitRegexExample {
	public static void main(String[] args) {
		String str = "  Hello World   ";
		// Split using multiple delimiters
	//	String[] strArr = str.split(" ");
		
		
		String[] strArr = str.trim().split("\\s+");

		// Print the resulting array
		for (String data : strArr) {
			System.out.print(data);
		}
		
		System.out.println();
		

	}
}
