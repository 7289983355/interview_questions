package loop;

public class PrintTraingle {
//	
//	*  i=0 :j=1
//	** i=1 ;j=2
//	***i=2 ;j=3
	public static void main(String[] args) {
		printTriangle(3);

	}

	public static void printTriangle(int rows) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i+1; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

//	i =0  ;j=1
//	i =1  ;j=0,1
//	i =2  ;j=0,1,2

}
