package basicMath_problem;

public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Dharmesh kumar";
		
		for(Character ch:name.toCharArray()) {
			
			 if (ch>=97 && ch<=122)
		        {
		            System.out.println(0);
		        }
		        else if (ch>=65 && ch<=90)
		        {
		            System.out.println(1);
		        }
		       
			
		}
	}
}


