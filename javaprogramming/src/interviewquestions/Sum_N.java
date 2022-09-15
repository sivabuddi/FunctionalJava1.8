package interviewquestions;
import java.util.*;
import java.util.stream.*;
// sum of n numbers
public class Sum_N {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,9,8,7,6,5,4,3,2,1);
		int result = list.stream().mapToInt(n -> n).sum();
		System.out.println(result);
		
	}

}
