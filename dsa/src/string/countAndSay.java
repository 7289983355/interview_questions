package string;

public class countAndSay {

	public static void main(String[] args) {
		int n = 5; // Example input
		System.out.println("Count and Say of " + n + ": " + countAndSay(n)); // Output: "312211"
	}

	private static String countAndSay(int number) {
//		1
//		11
//		21
//		1211
//		111221

		StringBuilder result = new StringBuilder();

		result.append("1");
		number--;

		for (int i = 0; i < number; i++) {

			char firstChar = result.charAt(i);

			result.append(1);

		}

		return null;
	}

}
