package patternmatching;
import java.util.regex.*;
public class Pattern_Quantifiers {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("a?");
		Matcher m = pattern.matcher("abaabaaab");
		while(m.find()){
			System.out.println(m.start()+"------->"+m.group());
		}
		
		
		
	}
	
	
}
