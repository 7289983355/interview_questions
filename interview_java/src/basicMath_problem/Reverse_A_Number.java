package basicMath_problem;

public class Reverse_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=-123;
		
		int result=0;
		
		while(num>0) {
			
		    int remainder=num%10;
		
		    
		    result=result*10+remainder;
		  
		     num=num/10;
			
		}
		  System.out.println(result);
	}

}
