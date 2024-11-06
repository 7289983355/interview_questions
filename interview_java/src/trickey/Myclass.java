package trickey;

public class Myclass {

	private Myclass() {
		System.out.println("private constructor is called ... ");
	}
	
	void display() {
		System.out.println("Private Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myclass myclass = new Myclass();

	}

}


