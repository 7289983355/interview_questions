package collection;
import java.util.ArrayList;
import java.util.ListIterator;
 
public class AddRemoveWhileIteratingThrowsCMEx {
 
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
 
 
        // iterate using Iterator
        ListIterator<String> listIterator = fruits.listIterator();
 
 
        // Forward Iterating
        while(listIterator.hasNext()) {
 
            if(listIterator.next().equalsIgnoreCase("Grapes")) {
 
                // trying to add element to Original list
                fruits.add("Banana");
            }
        }
 
 
        // print to console
        System.out.println("\nAfter removal of Cherry & addition of Banana :- \n"
                + fruits);
    }
}