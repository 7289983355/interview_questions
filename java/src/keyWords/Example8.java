package keyWords;

public class Example8 {
	static int value;

	static {
		value = 10; // Static block
		System.out.println("Static block executed, value: " + value);
	}

	public Example8() {
		value = 20; // Constructor
		System.out.println("Constructor executed, value: " + value);
	}

	public static void main(String[] args) {
		Example8 obj = new Example8(); // What will be the output?
	}
}

