package patternmatching;
import java.util.regex.*;
public class Pattern_Split {
	
	
	public static void main(String[] args) {
		
		
		Pattern pattern = Pattern.compile("\\."); // \\. or  [.] is same.
		String string[] = pattern.split("www.google.com");
		
		for(String str:string)
			System.out.println(str);
		
	}

}
