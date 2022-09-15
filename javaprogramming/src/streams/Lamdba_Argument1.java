package streams;

import java.util.*;
public class Lamdba_Argument1 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> strings =  new ArrayList<String>();
		
		strings.add("Siva");
		strings.add("Kumar");
		strings.add("Testing");
		
		// lamdba expression passed as an argument
		strings.replaceAll(e -> e.toUpperCase());
		
		System.out.print(strings);
		
		System.out.println();
		
		// retreive the elements one by one.
		strings.forEach(System.out::println);
		
		System.out.println("Reverse the list of elements");
		
		
		strings.forEach((e) -> 

				{
					
					String result = " ";
					for(int i=e.length()-1;i>=0;i--) {
						result+=e.charAt(i);
					}
					
					System.out.println(result);
									
				}
					
		);
		
		System.out.println();
		
		strings.forEach(
				
		(e) -> {
			
			String result = " ";
			for(int i =e.length()-1;i>=0;i--) {
				result += e.charAt(i);
			}
			
			System.out.println(result);
			
			
			}
				
		);
		
		
		
		
		

		
		
	}
	
}
