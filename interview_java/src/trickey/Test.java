package trickey;

 class ABC {
//craeting a private constructor   
	private ABC() {
	}

	void display() {
		System.out.println("Private Constructor");
	}
}

 public class Test {
	public static void main(String args[]) {
//compile time error  
		//ABC obj = new ABC();
	}
}