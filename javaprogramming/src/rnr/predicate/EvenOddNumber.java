package rnr.predicate;
import java.util.function.*;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Integer [] arr = {11,22,33,44,55,66,77,88,99};
		
		Predicate<Integer> even, odd;
		
		even = (n) -> n%2==0;
		
		odd = (n) -> n%2!=0;
		
		System.out.println("Display even numbers");
		display_values((n) -> n%2==0,arr);
		System.out.println("Display Odd Numbers");
		display_values((n) -> n%2!=0,arr);
		
	}
	
	
	public static void display_values(Predicate<Integer> predicate, Integer[] arr) {	
		
		for(Integer i:arr) {
			
			if(predicate.test(i))
				System.out.println(i);
			
			
		}
		
		
		
	}
	

}
