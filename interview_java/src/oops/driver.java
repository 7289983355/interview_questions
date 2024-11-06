package oops;

abstract class AbstractClass {
	abstract void abstractMethod();

	void concreteMethod() {
		System.out.println("Concrete method in abstract class");
	}
}

interface MyInterface {
	void interfaceMethod();
}

class Implementation extends AbstractClass implements MyInterface {
	void abstractMethod() {
		System.out.println("Implemented abstract method");
	}

	public void interfaceMethod() {
		System.out.println("Implemented interface method");
	}
}

public class driver {
	public static void main(String[] args) {
		AbstractClass obj = new Implementation();
		obj.concreteMethod();
		obj.abstractMethod();
		// obj.interfaceMethod(); // Uncommenting this will cause a compilation error
	}
}
