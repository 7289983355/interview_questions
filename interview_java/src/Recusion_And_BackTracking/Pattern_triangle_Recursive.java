package Recusion_And_BackTracking;

public class Pattern_triangle_Recursive {
//	****
//	***
//	**
//	*

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		patternT(4);

	}

	private static void patternT(int num) {
		trianglePrinter(num);

	}

	private static void trianglePrinter(int row) {
		// TODO Auto-generated method stub
		if(row < 0) {
			return;
		}

			System.out.print("*");
		
		trianglePrinter(row - 1);
		System.out.println();
	}

}
