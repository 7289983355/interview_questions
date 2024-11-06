package trickey;

public class Factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 25;

		System.out.println(factorial(num));

	}

	public static long factorial(int num) {

		long result=1l;
		if (num == 0 ||num==1) {
			return 1;
		}
		
		 while(num>=1) {
			 
			 result=result*num;
			 
			  num=num-1;
			 
		 }
		return result;

	}

}
