package Recusion_And_BackTracking;

public class count_Number_of_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=90870;
		
		System.out.println("Number of zero are :" +countNumberofZero(num));

	}

	private static int countNumberofZero(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while(num>0) {
			
			int remainder=num%10;
			if(remainder==0) {
				count++;
			}
			
			num=num/10;
			
		}
		return count;
	}

}
