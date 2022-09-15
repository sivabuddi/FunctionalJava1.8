package streams;

import java.util.*;
import java.util.stream.*;


public class EvenOdd {
	
	public static void main(String[] args) {
		
		List<Integer> nums1 = new ArrayList<Integer>();
		
		for(int i=1;i<20;i++)
			nums1.add(i);
		
		List<Integer> nums = new Random().ints(0,300).limit(10).boxed().collect(Collectors.toList());
		System.out.println(nums);
		
		Map<Boolean, List<Integer>> response = nums.stream()
		        .collect(Collectors.partitioningBy(n -> n % 2 != 0));
		
		List<Integer> even = response.get(true);
		List<Integer> odd = response.get(false);
		
		System.out.print(even);
		System.out.print(odd);
		
		System.out.println();
		
		List<Integer> odd_num = nums.stream().filter(n->n%2!=0).collect(Collectors.toList());
		List<Integer> even_num = nums.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(odd_num);
		System.out.println(even_num);
			
		
	}

}
