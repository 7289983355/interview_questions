package interfaceDemo;

interface A {
	default void hello() {
		System.out.println("Hello from A");
	}
}

interface B {
	default void hello() {
		System.out.println("Hello from B");
	}
}

class C implements A, B {

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		B.super.hello();
	}
//	@Override
//	public void hello() {
//		System.out.println("Hello from C");
//	}
}

public class Test {
	public static void main(String[] args) {
		C obj = new C();
		obj.hello();
	}
}
