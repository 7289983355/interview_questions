package Recusion_And_BackTracking;

public class Power_Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(power(4,2));
	}

	public static int power(int x, int n) {
		// x power n =>eg 4 power 2 =>4*4 ;
		
		if(n==0) {
			return 1;
		}
		
		return ( x* power( x,n-1));
		
		
		
		

	}

}