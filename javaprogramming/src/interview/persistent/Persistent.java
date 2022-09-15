package interview.persistent;

import java.util.Arrays;
import java.util.*;
public class Persistent {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(23,435,56,23,56,54,90);
		
		System.out.println("Original List"+"\n"+list);
		Collections.sort(list);
		System.out.println("After sorting Original List"+"\n"+list);
		
		System.out.println("Second maximum from collection framework="+list.get(list.size()-2));
		
		
		int result=list.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findAny().get();
		System.out.println("Second max from streams="+result);
	
		
		Integer [] arr = {23,435,56,23,56,54,90};
		
		Integer max_number=Integer.MIN_VALUE;
		Integer second_max_number=Integer.MIN_VALUE;
		
		
		for(Integer i:arr) {
			if(i>max_number)
				max_number=i;
		}
		
		System.out.println("First Max="+max_number);
		
		
		for(Integer i:arr) {
			
			if(i>second_max_number && i!=max_number)
				second_max_number=i;
			
		}
		
		System.out.println("Second Max from traditional loops="+second_max_number);
	}

}
