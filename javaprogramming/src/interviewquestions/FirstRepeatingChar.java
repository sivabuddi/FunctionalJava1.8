package interviewquestions;
import java.util.*;
import java.util.function.Function;
import java.util.spi.*;
import java.util.stream.Collectors;
// Q8 Given a String, find the first repeated character in it using Stream functions?
public class FirstRepeatingChar {
	
	
	public static void main(String[] args) {
		
		String result = "Siva Kumar Buddi from India";
		
		result.chars()
		      .mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
		      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		      .entrySet()
		      .stream()
		      .filter(entry -> entry.getValue() > 1)
		      .map(entry -> entry.getKey())
		      .findFirst()
		      .ifPresent(System.out::println);
	}

}
