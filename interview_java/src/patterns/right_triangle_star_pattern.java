package patterns;

//    * i=0 ,j= 5  space=4 
//   ** i=1 ,j= 45 space=3
//  *** i=2 ,j=345 space=2
// **** i=3 ,j=2345 space=1
//***** i=4 ,j=12345
public class right_triangle_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= 5 - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k =0; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
