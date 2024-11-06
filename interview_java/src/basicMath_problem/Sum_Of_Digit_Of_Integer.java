package basicMath_problem;

public class Sum_Of_Digit_Of_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  number=234;
		int reverse=0;
		
		int sum=0;
		
		while(number>0) {
			
		int	remainder=number%10;
		
		reverse=reverse*10+remainder;
		
		sum+=remainder;
		
		number=number/10;
			
		}
		
		System.out.println("Sum : "+sum +"  reverse : "+reverse );

	}

}
