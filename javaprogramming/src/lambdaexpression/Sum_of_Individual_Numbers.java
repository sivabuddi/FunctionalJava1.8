package lambdaexpression;
import java.util.Arrays;
import java.util.stream.*;
public class Sum_of_Individual_Numbers {
	
	
	public static void main(String[] args) {
		
		
		int arr []= {12,34,45};
		String str = Arrays.toString(arr);
		Integer result = Arrays.stream(str.split("")).filter((s) -> s.matches("\\d")).mapToInt(Integer::valueOf).sum();
		System.out.println("Sum of indiviudal digits in a given array ="+result);
		
		
	}

}
