package string;

public class StringSplit {
	public static void main(String[] args) {
		String str = "one,two,three,,four";
		String[] arr = str.split(",");
		System.out.println(arr.length);
	}
}
