package string;

public class StringImmutableTest {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Ja" + "va";
		str1 += " Programming";
		System.out.println(str1 == str2);
	}
}
