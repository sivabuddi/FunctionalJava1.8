package interviewquestions;
import java.util.*;
import java.util.stream.*;

// Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class Starting_With_1 {

	
	public static void main(String[] args) {
		
		//List<Integer> list_integer = new Random().ints(10).boxed().toList();
		
		//List<Integer> list_integer = Arrays.asList(43,56,767,43,67,878,44,465,41,67,65,34);
		List<Integer> list_integer = new Random().ints(0,50000).limit(50).boxed().collect(Collectors.toList());
		List<String> list_string = list_integer.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
		
		list_integer.stream().map(s -> s+"").filter(e -> e.startsWith("4")).forEach(System.out::println);		
		
		List<String> result = list_string.stream().filter(e -> e.startsWith("4")).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		System.out.println(result);
		
		
	}
	
}
