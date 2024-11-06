package collection;
import java.util.ArrayList;
 
public class AddRemoveWhileIteratingUsingForEachLoop {
 
    public static void main(String[] args) {
 
        // Fruits list
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Melons");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Grapes");
 
 
        // print to console
        System.out.println("Original Fruit List :- \n" + fruits + "\n\n");
 
 
        // iterate List elements using forEach loop
        for(String fruit : fruits) {
 
            // try to remove from original List
            fruits.remove(fruit);
        }
 
 
        // print to console
        System.out.println("\nAfter removal of Melons & addition of Banana :- \n"
                + fruits);
    }
}