package lambdaexpression;
import java.util.*;
public class SecondMax_Collections {

	public static void main(String[] args) {
		 
		List<Integer> list = Arrays.asList(12,34,212,45,56,32,123);
		System.out.println("Orignal List ="+list);
		Collections.sort(list);
		System.out.println("Ater Soring ="+list);
		System.out.println();
		System.out.println("Second largest element ="+list.get(list.size()-2));
		
	}

}
