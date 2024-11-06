package basicMath_problem;

public class Print_all_the_factors_number_other_than_1_and_the_number_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=11;
		
		for(int i=2 ; i<number ;i++) {
			
			if(number%i==0) {
				
				System.out.println(i);
			}
		}

	}

}
