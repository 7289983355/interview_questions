package string;

public class StringEquals {
	
	public static void main(String[] args) {
		String s1 = "test";
		String s2 = "test";
		String s3 = new String("test");

		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1 == s3);//false
	}
}
