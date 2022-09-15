package interviewquestions;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
// Given a String, find the first non-repeated character in it using Stream functions?

public class FirstNonRepeatingChar {

	
	public static void main(String[] args) {
		
		String result = "Siva Kumar Buddi From India";
		
		Character ch = result.chars()
					.mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
					.entrySet()
					.stream()
					.filter(entry -> entry.getValue()==1L)
					.map(entry -> entry.getKey())
					.findFirst()
					.get();
		
		
		System.out.println(ch);
		
		
		result.chars()
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue()==1L)
				.map(entry -> entry.getKey())
				.findFirst().ifPresent(System.out::print);
	
		
	}
	
}
