package interviewquestions;
import java.util.*;
import java.util.stream.*;
// Given a list of integers, find the maximum value element present in it using Stream functions?
public class Max_Element {
	
	public static void main(String[] args) {
		
		List<Integer> list_integer  = Arrays.asList(12,34,21,45,567,34333,454,2232,4534321);
		
		int result = list_integer.stream().max(Integer::compare).get();
		
		System.out.println(result);
	}

}
