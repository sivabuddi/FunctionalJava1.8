package functionalinterface;
import java.util.function.Function;
public class Function_NullValue {
	

	public static void main(String[] args) {
		
		Function<Integer, Double> test = (i) -> i/2.0;
		
		test = test.andThen(a -> 3*a);
		
	    try {
	    	
	      System.out.print(test.apply(5));
	    	
	    }catch (Exception e) {
			// TODO: handle exception
	    	
	    	System.out.println("Handling Null value, please pass integer values instead");
//	    	e.printStackTrace();
	    	
		}
		
		
		
	}

}
