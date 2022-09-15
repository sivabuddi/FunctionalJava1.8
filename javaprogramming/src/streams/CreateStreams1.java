package streams;

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.*;

// creating stream using of belongs to Stream and stream method(belongs to list extends from collection)
public class CreateStreams1 {
	
	public static void main(String[] args) {
		
		// creating a stream of fixed numbers using of method
		
		Stream<Integer> stream1  = Stream.of(1,2,3,4,5,6,7,8,9);
		stream1.forEach(p->System.out.print(p+", "));
		
		// creating a stream from array 
		
		System.out.println();
		
		Stream<Integer> stream2 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9}); 
		stream2.forEach(p->System.out.print(p+", "));
		
		System.out.println();
		
		//creating a stream from List
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<10;i++)
			list.add(i);
		
		
		for(int num:list)
			System.out.print(num+", ");
		
		
		System.out.println();
		
		Stream<Integer> stream3= list.stream();
		stream3.forEach(p->System.out.print(p+", "));
		
		System.out.println();
		
		Stream<Integer> random_numbers = Stream.generate(()->(new Random().nextInt(100))); 
		random_numbers.limit(20).forEach(p->System.out.print(p+", "));
		
		System.out.println();
		
		
		Stream<Integer> random_numbers1 = Stream.generate(()->(new Random().nextInt(100))); 
		random_numbers1.limit(20).forEach(System.out::println);
		
		System.out.println();
		
		
		
		Stream<Integer> iterate_numbers = Stream.iterate(0,n->n+1); 
		iterate_numbers.limit(20).forEach(p->System.out.print(p+", "));
		
		System.out.println();
		
		
		
		IntStream stream = "12345_abcdefg".chars();
		stream.forEach(p->System.out.println((char)p));
		
		Stream<String> streams = Stream.of("A$B$C".split("\\$"));
		streams.forEach(p -> System.out.println(p));
		
	}

}
