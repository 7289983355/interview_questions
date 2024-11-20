package string;

public class StringComparison {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Ja" + "va";
		String s3 = new String("Java");

		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		System.out.println(s2 == s3);//false
	}
}
