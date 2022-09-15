package lambdaexpression;
import java.util.*;
import java.util.stream.*;
public class Duplicate_Elements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,34,45,12,45,56,67,67);
		HashSet<Integer> set = new HashSet<Integer>();
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
		
	}
	
	
}
