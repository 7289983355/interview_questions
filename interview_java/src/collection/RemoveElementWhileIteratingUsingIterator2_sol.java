package collection;
import java.util.ArrayList;
import java.util.Iterator;
 
public class RemoveElementWhileIteratingUsingIterator2_sol {
 
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
 
 
        // get Iterator
        Iterator<String> iterator = fruits.iterator();
 
 
        // iterate using Iterator
        while(iterator.hasNext()) {
 
            // try to add/remove from original List
            if(iterator.next().equalsIgnoreCase("Melons")) {
            	iterator.remove();
            	
            }
        }
 
 
        // print to console
        System.out.println("\nAfter removal of Cherry :- \n" + fruits);
    }
}