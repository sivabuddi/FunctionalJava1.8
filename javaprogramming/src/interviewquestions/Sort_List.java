package interviewquestions;
import java.util.*;
import java.util.stream.*;

//  Given a list of integers, sort all the values present in it using Stream functions?
public class Sort_List {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,21,34,23232,56,232,67676,2322,34);
		
		List<Integer> result = list.stream().sorted().collect(Collectors.toList());		
		
		System.out.println(result);
		
		list.stream().sorted().forEach(System.out::println);
		
	}

}
