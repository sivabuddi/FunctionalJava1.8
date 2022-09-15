package streams;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
public class StreamCollectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<21;i++)
			list.add(i);
		
		Stream<Integer> stream1 = list.stream();
		stream1.forEach(p->System.out.println(p));
		
		// Collect Stream elements to a List
		
		Stream<Integer> stream2= list.stream();
		List<Integer> even = stream2.filter(n -> n%2==0).collect(Collectors.toList());
		
		System.out.println(even);
		
		
		 // Collect Stream elements to a List
		List<Integer> odd = list.stream().filter(n -> n%2!=0).collect(Collectors.toList());
		System.out.println(odd);
		
		// Collect Stream elements to an Array
		
		Integer[] even_array = list.stream().filter(n->n%2==0).toArray(Integer[]::new);
		System.out.println(even_array);
		
		for(int i:even_array)
			System.out.print(i+" ");
		
		
		
		
	}

}
