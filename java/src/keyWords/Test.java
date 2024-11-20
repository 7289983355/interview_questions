package keyWords;
class Parent {
    static void display() {
        System.out.println("Parent's static display method");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child's static display method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();  // What will be printed?
    }
}

//Explanation: Static methods are not overridden in the same way that instance methods are. 
//They are resolved at compile-time based on the reference type, not the object type.