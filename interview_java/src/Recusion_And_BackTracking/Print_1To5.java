package Recusion_And_BackTracking;

public class Print_1To5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1,2,3,4,5
		
		print(1);

	}

	private static void print(int i) {
		// TODO Auto-generated method stub
		if(i>5) {
			return;
		}
		
		System.out.println(i);
		print(i+1);
		
	}

}