package interview_java_8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class separate_odd_even_numbers {

	public static void main(String[] args) {
		
		   List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		   
		   
//		  listOfIntegers.stream()
//		                .filter(num ->num%2==0)
//		                .collect(Collectors.toList())
//		                .forEach(num ->System.out.println("Even :" +num));
//		  
//		  listOfIntegers.stream()
//          .filter(num ->num%2!=0)
//          .collect(Collectors.toList())
//          .forEach(num ->System.out.println("Odd :" +num));
		   
		
		   
		Map<Boolean ,List<Integer>>  mapOfNumbers= listOfIntegers.stream().collect(Collectors.partitioningBy(x->x%2==0));
		
	   
		//mapOfNumbers.forEach((k,v) -> System.out.println("Key :  " +k + "   Value : "+v)) ;
	    

//		     Set<Entry<Boolean ,List<Integer>>>  data=mapOfNumbers.entrySet();
//		     
//		     for(Entry<Boolean ,List<Integer>>  singleEntry  :data) {
//		    	 
//		    	 System.out.println( "Key : " +singleEntry.getKey() + " value :  "+singleEntry.getValue());
//		     }
//		
		
		  Iterator<Entry<Boolean ,List<Integer>>>  data=mapOfNumbers.entrySet().iterator();
		
		 while(data.hasNext()) {
			 Entry<Boolean ,List<Integer>>  singleEntry=data.next();
			 System.out.println( "Key : " +singleEntry.getKey() + " value :  "+singleEntry.getValue());
		 }
		
	}
	
	

}
