package string_question;

public class Palindrome_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "non".toLowerCase();
		
		System.out.println(isPalindrome(s) ? "palindrome": "Not palindrome");
	}
	
	private static boolean isPalindrome(String s) {
		
		int leftidex=0;
		int rightidex=s.length()-1;
		while(leftidex<rightidex) {
			
			if(s.charAt(leftidex)!=s.charAt(rightidex)) {
				return false;
			}
			leftidex++;
			rightidex--;
		}
		
		return true;
	}

}
