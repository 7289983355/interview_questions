package Recusion_And_BackTracking;

public class Sum_the_digit_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(14567));

	}

	private static int sum(int num) {
		// TODO Auto-generated method stub
		if(num==1) {
			return num;
		}
		return num%10 * sum(num/10);

	}

}