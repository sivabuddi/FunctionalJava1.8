package functionalinterface;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
public class Display_StartsWith {
	
	
	public static void main(String[] args) {
		
		// Method1
		List<String> names = Arrays.asList("Siva","Kumar","Santhi","Gargi");
		
		Predicate<String> pred = (s) -> s.startsWith("S");
		
		
		for(String name:names) {
			
			if(pred.test(name))
				System.out.println(name); // print
			
		}
		
		System.out.println("-----------------------------");
		// Method2
		
		
		names = names.stream().filter((s) -> s.startsWith("S")).collect(Collectors.toList());
		names.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		
		for(String name:names)
			System.out.println(name);
		
		
		System.out.println("-----------------------------");
		Stream<String> named = names.stream().filter((s) -> s.startsWith("S"));
		List<String> result= named.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		
		
	}

}
