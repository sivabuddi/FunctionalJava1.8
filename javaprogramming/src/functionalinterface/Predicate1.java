package functionalinterface;
import java.util.function.Predicate;


public class Predicate1 {
	
	
	public static void main(String[] args) {
		
		
		// create predicate 
		
		Predicate<Integer> lessvalue = i -> (i<20);
		
		// calling test method inside Predicate Interface
		
		System.out.println(lessvalue.test(15));
		
		
	}
	
	
	

}
