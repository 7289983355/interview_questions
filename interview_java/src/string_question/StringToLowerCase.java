package string_question;

public class StringToLowerCase {

	public static void main(String[] args) {

		String name = "Dharmesh";
		System.out.println(strTolowerCase(name));
	}

	private static String strTolowerCase(String name) {
		
		StringBuilder sb = new StringBuilder();
		for (char c : name.toCharArray()) {
			if (65 <= c && c <= 90) {
				
				char cdata= (char) (c+32);
				sb.append(cdata);
			}else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
