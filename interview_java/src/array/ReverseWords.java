package array;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "  Hello World   ";
		// Split using multiple delimiters
		String[] strArr = str.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = strArr.length-1; i > 0; i--) {

			if (strArr[i].isEmpty()) {
				continue;
			}

			if (sb.isEmpty()) {
				sb.append(strArr[i]);
			} else {
				sb.append(" ");
				sb.append(strArr[i]);
			}

		}

		System.out.println(sb.toString());

	}
}