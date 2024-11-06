package patterns;

public class Hollow_Square_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;

		for (int i = 0; i < size; i++) { //0,1,2,3,4

			for (int j = 0; j < size; j++) {
			
				if(i==0||i==size-1) {
					System.out.print("*");
				}else  {
					
					if(j==0 ||j==size-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}

	}

}
