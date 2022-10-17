package duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// How to find duplicate elements in a given integers list in java using Stream functions?
public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list_integer = Arrays.asList(11,22,22,33,44,44,55,66);
		Set<Integer> set = new HashSet<Integer>();
		list_integer.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		System.out.println("-------------------------------------");

		//  Display only one element irrespective of number of elements present in the list
		Set<Integer> duplicate=list_integer.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
		System.out.println(duplicate);
	}
	
}
