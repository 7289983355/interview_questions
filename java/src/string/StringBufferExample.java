package string;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World").insert(5, ",");
		System.out.println(sb);
	}
}
