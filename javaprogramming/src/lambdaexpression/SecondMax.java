package lambdaexpression;
import java.util.stream.*;
import java.util.*;
public class SecondMax {
	
	public static void main(String[] args) {
		
		int arr[] = {43,23,45,666,232,1,56,67};
		
		int second_largest =Arrays.
							stream(arr).
							boxed().
							sorted(Comparator.reverseOrder()).
							skip(1).
							findFirst().
							get();
		
		System.out.println(second_largest);
		
		
		
		
	}

}
