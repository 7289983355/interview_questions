package string;

public class StringIntern {
	public static void main(String[] args) {
		String str1 = new String("hello").intern();
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = str3.intern();

		System.out.println(str1 == str2);//true
		System.out.println(str2 == str3);//false
		System.out.println(str3 == str4);//false
	}
}
