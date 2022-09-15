package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(12,3,4,5,6,77,8);
		list.stream().flatMap(s ->Stream.of(s)).forEach(System.out::println);
		
		
	}

}
