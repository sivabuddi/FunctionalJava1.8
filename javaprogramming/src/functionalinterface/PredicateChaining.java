package functionalinterface;
import java.util.function.Predicate;
public class PredicateChaining {
	
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> greaterthanten = (i) -> (i>10);
		Predicate<Integer> lessthanthan20 = (i) -> (i<20);
		
		boolean result =  greaterthanten.and(lessthanthan20).test(15);
		System.out.println(result);
		
		boolean result1= lessthanthan20.and(greaterthanten).test(25);
		System.out.println(result1);
  		
	}
	

}
