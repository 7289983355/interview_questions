package set;
// Import the HashSet class
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    
    cars.add("Mazda");
    
    if(cars.add("Mazda")) {
    	
    	System.out.println("found");
    }
    System.out.println(cars);
  }
}
