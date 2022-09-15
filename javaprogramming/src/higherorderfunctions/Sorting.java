package higherorderfunctions;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		 
		List<String> list = new ArrayList<String>();
		list.add("ghi");
		list.add("def");
		list.add("abc");
		
		System.out.println("Original List="+list);
		System.out.println();
		
		
		Collections.sort(list, (String a, String b) -> {return a.compareTo(b);});	
		System.out.println("List elements sorted in ascending order ="+list);	
		System.out.println();
			
		Collections.sort(list, (String a, String b) -> {return b.compareTo(a);});
		System.out.println("List elements sorted in descending order ="+list);	
	}

}
