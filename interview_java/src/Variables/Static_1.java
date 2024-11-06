package Variables;

public class Static_1 {

	static int X=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_1.X=30;
		
		Static_1 s= new Static_1();
		
		s.X=40;
		
		System.out.println(Static_1.X);

	}

}
