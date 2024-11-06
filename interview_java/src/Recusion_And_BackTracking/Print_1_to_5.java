package Recusion_And_BackTracking;

public class Print_1_to_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(5);

	}

	private static void print(int num) {
		// TODO Auto-generated method stub
		if(num==0) {
			return;
		}
		System.out.println(num);
		print(num-1);
		
	}

}
