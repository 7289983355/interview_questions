package Recusion_And_BackTracking;

public class Pattern_triangle {
//	****
//	***
//	**
//	*

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		patternT();

	}

	private static void patternT() {
		// TODO Auto-generated method stub
		
		for(int i=4 ; i>0;i--) {
			for(int j=4 ; j>0;j--) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
