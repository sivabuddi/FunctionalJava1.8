package patternmatching;
import java.util.regex.*;
public class Pattern1 {

	public static void main(String[] args) {
		 
		 Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		 Matcher m = pattern.matcher("a7b@z#9");
		 while(m.find()) {
			 System.out.println(m.start()+"------->"+m.group());			 		 
		 }
		
	}

}
