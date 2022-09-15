package interviewquestions;
import java.util.*;
import java.util.stream.*;
// Write a Java 8 program to find the lowest and highest number of a Stream?
public class Max_Min {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Stream.of(1,2,33,12,56,43).collect(Collectors.toList());
		List<Integer> list1= Arrays.asList(12,324,45,453);
		
		// procedure 1
		int result =list1.stream().max(Integer::compare).get();		
		System.out.println(result);
		
		// procedure 2
		int result_max =list.stream()
		      .max(Comparator.comparing(Integer::valueOf))
		      .get();
		// procedure 3
		int result_min = Stream.of(1,2,33,12,56,43)
				.min(Comparator.comparing(Integer::valueOf))
				.get();
		
		System.out.println(result_max);
		System.out.println(result_min);
		
	}

}
