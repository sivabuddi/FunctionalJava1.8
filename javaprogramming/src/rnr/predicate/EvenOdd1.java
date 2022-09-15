package rnr.predicate;
import java.util.function.*;
public class EvenOdd1 {

	public static void main(String[] args) {
		Integer[] arr  = {11,22,33,44,55,66,77};		
		display_values((n)->n%2==0, arr);
		
	}
	
	
	public static void display_values(Predicate<Integer> predicate, Integer [] arr) {
		
		System.out.println("Even Numbers List");
		for(Integer n:arr) {			
			if(predicate.test(n)) {
				System.out.println(n);
			}			
		}
			
		System.out.println("Odd Numbers List");
		for(Integer n:arr) {			
			if(!predicate.test(n)) {
				System.out.println(n);
			}
		}
	}
}
