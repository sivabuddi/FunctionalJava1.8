package interviewquestions;
import java.util.*;
import java.util.stream.*;

// How to find duplicate elements in a given integers list in java using Stream functions?
public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list_integer = Arrays.asList(34,45,56,34,45,89,9,23,45,56,44);
		Set<Integer> set = new HashSet<Integer>();
		list_integer.stream().filter(n -> set.add(n)).forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		
	}
	
}
