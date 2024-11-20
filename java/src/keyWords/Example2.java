package keyWords;

public class Example2 {
	static int count = 0;

	public static void main(String[] args) {
		Example2 obj1 = new Example2();
		Example2 obj2 = new Example2();

		obj1.increment();
		obj2.increment();

		System.out.println("obj1 count: " + obj1.count);
		System.out.println("obj2 count: " + obj2.count);
	}

	void increment() {
		count++;
	}
}

//Reason: Static variables are shared among all instances of the class.
//When obj1.increment() is called, it increments count, and 
//when obj2.increment() is called, it increments the same count variable. 
//Since count is static, both objects refer to the same variable.