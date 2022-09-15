package lambdaexpression;
import java.util.stream.*;
import java.util.*;
public class Add_Numbers_Strings {

	public static void main(String[] args) {
//		int arr[] = {12,34,45};
//		String str = Arrays.toString(arr);
		String str="This is addition of 12 and 23 is equal to 35";
		Integer sum = Arrays.
					  stream(str.split(" ")).
					  filter((s) -> s.matches("\\d+")).
					  mapToInt(Integer::valueOf).
					  sum();
					  
		System.out.println("Sum of numbers in a given string = "+sum);
		
		
	}

}
