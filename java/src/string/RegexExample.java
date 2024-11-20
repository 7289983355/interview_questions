package string;

public class RegexExample {
	public static void main(String[] args) {
		String str = "abc123xyz456";
		String[] parts = str.split("\\d+");
		System.out.println(parts.length);
	}
}
