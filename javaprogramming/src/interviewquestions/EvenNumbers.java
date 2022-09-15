package interviewquestions;
import java.util.stream.*;
import java.util.*;
// Given a list of integers, find out all the even numbers exist in the list 
// using Stream functions?
public class EvenNumbers {
	
	public void message() {
		System.out.println("Im in message method");
	}

	public static void main(String[] args) {
		// creating list1
		List<Integer> list_int1 = new ArrayList<Integer>();
		
		for(int i=1;i<12;i++)
			list_int1.add(i);
		
		
		// method1
		Stream<Integer> result= list_int1.stream().filter(e -> (e%2==0));
		result.forEach(System.out::println);
		
		System.out.println();
		// method2
		List<Integer> result1= list_int1.stream().filter(e -> (e%2 ==0)).collect(Collectors.toList());
		System.out.println(result1);
		
		
		
		// creating list2
		List<Integer> list_int2 = Arrays.asList(23,45,11,67,54,43,76);
		System.out.println(list_int2);
		
		
		// creating list3
		int [] list_3 = {34,54,23,567,12,45,566};
		List<Integer> list_4= Arrays.stream(list_3).boxed().collect(Collectors.toList());
		
		// creating list4
		int [] list_5 = {34,54,23,567,12,45,566};
		Integer[] results = Arrays.stream(list_5).boxed().toArray(Integer[]::new);
		System.out.println("Integer value "+Arrays.toString(results));
		
		
		
		
		
	}
	
	
}
