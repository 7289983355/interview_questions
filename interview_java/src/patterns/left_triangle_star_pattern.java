package patterns;

public class left_triangle_star_pattern {
//	*  //i=0 ,j=0
//	** //i=1 ,j=1
//	***
//	****
//	*****
	public static void main(String[] args) {
		
		for(int i=0 ;i<5 ;i++) {
			
			for(int j=0 ;j<=i ;j++) { //i=0  ,j=1  ,
				
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
