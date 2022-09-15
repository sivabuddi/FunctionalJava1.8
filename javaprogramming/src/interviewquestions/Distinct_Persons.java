package interviewquestions;
import java.util.*;
import java.util.stream.*;
// Let’s test the code. We will add a few duplicate person records in the List.
//Then we will use the Stream.distinct() method to find all instances of Person class with unique id.

// https://howtodoinjava.com/java8/java-stream-distinct-examples/
public class Distinct_Persons {
	
	public static void main(String[] args) {
		
		
		Person one = new Person("1", "Siva", 10000);
		Person two = new Person("2", "Rama", 23000);
		Person three = new Person("3", "Rakesh",45000);
		Person four = new Person("4", "Siva",60000);
		Person five = new Person("4", "Rajeev",5000);
		Person six = new  Person("2", "Kishan",78000);
		
		
		
		List<Person> list = Arrays.asList(one, two, three, four, five,six);
		list.stream().distinct().forEach(System.out::println);
		
		System.out.println();
		
		List<Person> list_person = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list_person);	
		
		
//		List<String> names = Arrays.asList("Arvind","Jhon","Marco","Jhon","Arvind");
//	    
//	    List<String> distinctNames = names.stream()
//	                                .distinct()
//	                                .collect(Collectors.toList());
//	     
//	    System.out.println(distinctNames); 
		
		
		
	}

}
