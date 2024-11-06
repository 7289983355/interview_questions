package patterns;

//*****
//****
//***
//**
//*
public class Left_down_triangle {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			for (int i = 0; i < 5; i++) {

				for (int j = 0; j <= 5 - 1 - i; j++) {
					System.out.print("*");
				}
			
				System.out.println();
			}
			

	}

}
