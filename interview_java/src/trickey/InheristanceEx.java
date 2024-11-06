package trickey;

class A {
	int x=10;
	void display() {
		System.out.println("A : " +x);
	}

}

class B extends A{
	int x=20;
	void display() {
		System.out.println("B : " +x);
	}
}

public class InheristanceEx{
	public static void main(String args[]) {
		
		A obj = new B();
		obj.display();
		System.out.println("R : " +obj.x);
		
	}
}