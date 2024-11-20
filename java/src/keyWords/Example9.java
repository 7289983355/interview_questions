package keyWords;
interface MyInterface {
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

    default void defaultMethod() {
        System.out.println("Default method in interface");
    }
}

public class Example9 implements MyInterface {
    public static void main(String[] args) {
        // How do you call the static method from the interface?
    	MyInterface.staticMethod(); // Is this valid?
    }
}