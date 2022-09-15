package rnr.predicate;
import java.util.function.*;
public class PredicateDemo {

	public static void main(String[] args) {
	 
		Predicate<Integer> predicate =(i) -> {return i>10;};
		boolean result  = predicate.test(12);
		System.out.println("Result = "+result);
	}

}
