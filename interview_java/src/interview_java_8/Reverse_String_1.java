package interview_java_8;

public class Reverse_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Dharmesh"; 
		
		char[]  charArray=name.toCharArray();
		
		for(int i=name.length()-1 ; i>=0 ;i--) {
			
			System.out.println(charArray[i]);
		}

	}

}
