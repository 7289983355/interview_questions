package string_question;

public class Check_for_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Did".toLowerCase();
		
		  System.out.println(isPalindrome(s) ? "Palindrome found" : "Not a palindrome");
		
	}
		private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
			  StringBuilder reversedString = new StringBuilder();
			  for (Character c : s.toCharArray()) {
					reversedString.append(c);
				}
			   // Compare the original string with the reversed one
		        return s.equals(reversedString.toString());
	}
}
