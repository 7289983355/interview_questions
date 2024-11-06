package string;

public class StringBuilderTest1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" is fun").replace(5, 7, "is not");
		System.out.println(sb);
	}
}


