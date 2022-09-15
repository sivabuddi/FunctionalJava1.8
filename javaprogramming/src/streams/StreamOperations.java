package streams;

import java.util.*;
import java.util.stream.*;

public class StreamOperations {

	public static void main(String[] args) {
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		System.out.println(memberNames);
		
		
		Stream<String> stream_string1 = memberNames.stream();
		stream_string1.filter((s) -> s.startsWith("A")).forEach(p->System.out.println(p));
		
 
		List<String> string2= memberNames.stream().filter((s) -> s.startsWith("A")).collect(Collectors.toList());
		System.out.println(string2);
		
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
		
		
		
	}
	
	
}
