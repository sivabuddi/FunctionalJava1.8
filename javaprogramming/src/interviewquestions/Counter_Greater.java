package interviewquestions;
import java.util.*;
import java.util.stream.*;

// Write a Java 8 program to find the number of Strings in a list whose length is greater than 5?
public class Counter_Greater {
	
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("siva", "sivakumar","buddi");
		System.out.println(list);
		
		List<String> strings = new ArrayList<String>();
		strings.add("Hello");
		strings.add("Worlds");
		strings.add("Helloworld");
		
		
		Long count = list.stream().filter(n -> n.length()>5).count();
		System.out.println("Total no .of. words whose lenght is greater than 5 = "+count);
	
	}

}
