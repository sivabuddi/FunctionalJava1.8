package rnr.predicate;
import java.util.function.*;

public class PredicateDemo1 {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (i) -> i>10;
		Integer [] arr= {11,22,8,9,55,9,8,7,45,433,67,-23,345};
		passing_predicate(predicate,arr);
	}
	
	public static void passing_predicate(Predicate<Integer> predicate, Integer [] arr) {
		
		for(Integer i:arr) {
			
			if(predicate.test(i))
				System.out.println(i +" is greater than 10");
			
		}
		
	}

}
