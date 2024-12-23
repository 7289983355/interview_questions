package JavaIIand17;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
    	
    	
        Optional<String> optionalValue = Optional.ofNullable("Hello");

        // Using ifPresentOrElse
        optionalValue.ifPresentOrElse(value -> System.out.println("Value present: " + value),
        		 () -> System.out.println("Value not present")
       );

        // Example with an empty Optional
        Optional<String> emptyValue = Optional.empty();
        emptyValue.ifPresentOrElse(
            value -> System.out.println("Value present: " + value),
            () -> System.out.println("Value not present")
        );
    }
}
