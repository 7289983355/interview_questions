package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    @Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
}

public class HashSetExample {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        
        people.add(p1); // Adds the object
        people.add(p2); // Will not add because p1.equals(p2) is true
        
        System.out.println(people.size()); // Output: 1
    }
}
