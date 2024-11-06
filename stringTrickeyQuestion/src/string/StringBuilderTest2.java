package string;

public class StringBuilderTest2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.replace(0, 2, "Hi");
		sb.reverse();
		System.out.println(sb);
	}
}