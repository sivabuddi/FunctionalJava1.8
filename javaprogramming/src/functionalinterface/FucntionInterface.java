package functionalinterface;
import java.util.function.Function;
public class FucntionInterface {
	
	
	public static void main(String[] args) {
		
		
		Function<Integer, Double> test = (i) -> i/2.0;
		System.out.println("Final value="+test.apply(10));
		
		
	}

}
