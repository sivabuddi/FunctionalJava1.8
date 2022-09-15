package interviewquestions;
import java.util.*;
import java.util.stream.*;
// Given a list of integers, find the total number of elements present in the list using Stream functions?
public class Count_Elements {

	public static void main(String[] args) {
		
		List<Integer> list_integer =  Arrays.asList(43,23,11,55,67,45,343,23,34);
		Long count = list_integer.stream().count();
		System.out.println(count);
	}
	
	
	
	
}
