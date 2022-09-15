package functionalinterface;

import java.util.function.Function;
public class Functional_apply_anthen {
	
	
	public static void main(String[] args) {	
		Function<Integer, Double> test = (i) -> i/2.0;
		test = test.andThen(a -> 3*a);
		System.out.println("Final value = "+test.apply(10));
	}

}
