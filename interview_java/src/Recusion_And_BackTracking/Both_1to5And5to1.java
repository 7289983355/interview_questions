package Recusion_And_BackTracking;

public class Both_1to5And5to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(5);

	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		
		//5,4,3,2,1,1,2,3,4,5
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		print(n-1);
		System.out.println(n);
		
	}

}