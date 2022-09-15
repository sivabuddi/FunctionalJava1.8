package interviewquestions;
import java.util.*;
import java.util.stream.*;

// Given the list of integers, find the first element of the list using Stream functions?
public class FindFirstElement {

	public static void main(String[] args) {
		
		List<Integer> list_integers = Arrays.asList(12,34,45,546,4534,2323);
		
		Optional result = list_integers.stream().findFirst();
		System.out.println(result);
		list_integers.stream().findAny().ifPresent(System.out::println);
		
	}
	
}
