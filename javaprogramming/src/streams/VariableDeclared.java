package streams;

import java.util.*;
public class VariableDeclared {

	
	public static void main(String[] args) {
		
		String[] country = {null};
		
		List<String> cities= new ArrayList<String>();
		
		cities.add("Siva");
		cities.add("kumar");
		cities.add("buddi");
		
		//System.out.print(cities);
		
		
		cities.forEach(item -> 
				
				{if(item.equals("Siva"))
					country[0]="It is City";
					
				});
		
		
		System.out.println(country[0]);
		
		
	}
	
}
