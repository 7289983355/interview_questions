package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set= new HashSet<>(); 
		
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		
		List<String> list = new ArrayList<>(set);
		
		System.out.println(list.get(2));
		

	}

}
