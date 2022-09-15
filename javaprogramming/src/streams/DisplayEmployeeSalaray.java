package streams;

import java.util.stream.*;
import java.util.*;
public class DisplayEmployeeSalaray {
	
	public static void main(String[] args) {
		
		List<Employee> emp_list = new ArrayList<>(
				
				Arrays.asList(new Employee(1,"Siva",100),
						new Employee(2,"Kumar",200),
						new Employee(3,"Kishore",300),
						new Employee(4,"Rama",400),
						new Employee(5,"Parvathi",500),
						new Employee(6,"Aiswarya",600)));

		
		//emp_list = emp_list.stream().filter((e) ->e.getName().startsWith("A")).collect(Collectors.toList());
		
		Employee[] employee_array = emp_list.stream().filter((e) ->e.getSal()>400).toArray(Employee[]::new);
		String list = Arrays.toString(employee_array);
		
		for(int i=0;i<employee_array.length;i++)
			System.out.println(employee_array[i].getName());
		
		
		 	
			 
		
	}

}
