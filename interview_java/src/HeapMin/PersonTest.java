package HeapMin;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PersonTest {

	public static void main(String[] args) {
		
//		Comparator<Person> ageComparator = new Comparator<Person>() {
//			@Override
//			public int compare(Person p1, Person p2) {
//				return Integer.compare(p1.age, p2.age); // Ascending order by age
//			}
//		};
		
		
	
		Comparator<Person> nameComparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.name.compareTo(p2.name); // Ascending order by age
			}
		};
		
		

		PriorityQueue<Person> personQueue = new PriorityQueue<>(nameComparator);
		personQueue.add(new Person("Alice", 30));
		personQueue.add(new Person("Bob", 25));
		personQueue.add(new Person("Charlie", 35));

		// Accessing elements
		while (!personQueue.isEmpty()) {
			Person p = personQueue.poll();
			System.out.println(p.name + " is " + p.age + " years old.");
		}

	}

}
