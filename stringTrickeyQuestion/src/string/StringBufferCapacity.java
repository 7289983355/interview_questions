package string;

public class StringBufferCapacity {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(10);
		sb.append("Hello").append("World").append("dharmesh");
		System.out.println(sb.capacity());
	}
}
