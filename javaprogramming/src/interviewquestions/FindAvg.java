package interviewquestions;
import java.util.*;
import java.util.stream.*;

import javax.naming.LimitExceededException;
//  Write a Java 8 program to square the list of numbers and then filter out the numbers greater than 100 
// and then find the average of the remaining numbers?
public class FindAvg {
	
	public static void main(String[] args) {
		
		
		int [] array = IntStream.iterate(1,  n-> n+1).limit(10).toArray();
		List<Integer> list_integers = Arrays.stream(array).boxed().collect(Collectors.toList());
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		Stream<Integer> list2 = Stream.of(new Integer[] {11,22,33,44,55,66});
		
		OptionalDouble result = list.stream().mapToInt(n -> n*n).filter(n -> n>10).average();
		
		OptionalDouble result2 = list2.mapToInt(n -> n*n).filter(n -> n>10).average();
		
		if(result.isPresent())
			System.out.println("Average ="+result);
		
			
		
	}

}
