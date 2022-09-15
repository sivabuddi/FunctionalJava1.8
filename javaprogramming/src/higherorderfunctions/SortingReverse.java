package higherorderfunctions;
import java.util.*;
import java.util.stream.*;
public class SortingReverse {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("def");
		list.add("abc");
		list.add("ghi");
		
		System.out.println("Original List="+list);
		System.out.println();
		
		Comparator<String> compartor = (String a, String b) -> {return a.compareTo(b);};
		Collections.sort(list,compartor);
		
		System.out.println("Elements are ascending order="+list);
		System.out.println();
		
		
		Comparator<String> compartorReverse = compartor.reversed();// higher order function
		
		Collections.sort(list,compartorReverse);
		
		
		System.out.println("Elements are ascending order="+list);
		
		
		
	}
	
	
}
