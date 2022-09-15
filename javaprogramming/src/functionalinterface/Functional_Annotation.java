package functionalinterface;
import java.util.function.Function;

@FunctionalInterface
interface Testing{
	
	public int square(int a);
	
}


public class Functional_Annotation {
	
	public static void main(String[] args) {		
		Testing test = (a) -> {return a*a;};
        int result = test.square(5);
        System.out.println(result);
		
	}

}
