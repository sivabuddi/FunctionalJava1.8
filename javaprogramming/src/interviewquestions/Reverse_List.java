package interviewquestions;
import java.util.*;
import java.util.stream.*;

// Given a list of integers, sort all the values present in it in descending order using Stream functions?

public class Reverse_List {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(32,11,45,21,6576,23,1,12,11,232,43,487);
		System.out.println("Ascending Order");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("Descending Order");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		List<String> string = list.stream().map(s -> s+" ").collect(Collectors.toList());

		
		
	}

}
