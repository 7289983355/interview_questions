package string;

public class StringBufferTrick {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = sb1.append(" World");
		System.out.println(sb1);
		System.out.println(sb2);
	}
}
