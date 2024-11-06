package Variables;

public class StringNumberToint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String target = "321";
		  
		  for (char c : target.toCharArray()) {
			    int intValue = c - '0';
			    System.out.println("Character: " + c + ", Integer value: " + intValue + ", Type: char");
			}


	}

}
