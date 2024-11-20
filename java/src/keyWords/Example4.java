package keyWords;

public class Example4 {
	static int count = 0;

	public void increment() {
		count = 10; // Modifying the static variable in an instance method
	}

	public static void main(String[] args) {
		Example4 obj = new Example4();
		obj.increment(); // Increment count
		System.out.println(count); // What will be printed?
	}
}
