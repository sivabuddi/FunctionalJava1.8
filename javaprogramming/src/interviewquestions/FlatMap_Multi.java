package interviewquestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class FlatMap_Multi {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list1 =  Arrays.asList(11,22,33);
		List<Integer> list2 = Arrays.asList(44,55,66);
		List<Integer> list3 = Arrays.asList(77,88,99);
		
		List<List<Integer>> list = Arrays.asList(list1, list2, list3);
		
		list.stream().flatMap(s -> s.stream()).forEach(System.out::println);
		List<Integer> result = list.stream().flatMap(s ->s.stream()).collect(Collectors.toList());
		System.out.println(result);
		
		
		// find the maximum element
		
		int max_value = result.stream().max(Integer::compare).get();
		System.out.println(max_value);
		
	}
	
	
	

}
