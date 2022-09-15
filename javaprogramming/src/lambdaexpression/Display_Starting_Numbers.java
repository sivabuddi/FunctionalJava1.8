package lambdaexpression;
import java.util.*;
import java.util.stream.*;

public class Display_Starting_Numbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,34,45,23,11,45,676,134);
		list.stream().map(s -> s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);
		 
		
		
	}
	
	
}
