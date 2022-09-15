package lambdaexpression;
import java.util.*;
public class Find_Max_Any {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,23,345,23,45,56,78,454);
	
		// Method 1 (Only max)
		
		int result =  list.stream().max(Integer::compare).get();
		System.out.println(result);
		
		// Method 2 (Find any max)
		
		int arr[] = {12,23,345,23,45,56,78,454};
		int max_value = Arrays.stream(arr). // returning java.lang.stream.Stream
						boxed(). // retunring java.lang.stream.Stream<java.lang.Integer>
						sorted(Collections.reverseOrder()).// returning java.lang.stream.Stream
						//limit(1).//returning  java.lang.stream.Stream
						skip(1).// returning java.lang.stream.Stream
						findFirst().// retuning java.lang.Optional
						get();
		System.out.println(max_value);
		
		
		List<Integer> list1=Arrays.asList(12,23,345,23,45,56,78,454);
		
		int second_max=list1.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(second_max);
		
		
		
	}
	

}
