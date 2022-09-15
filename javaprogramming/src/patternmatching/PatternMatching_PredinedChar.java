package patternmatching;
import java.util.regex.*;
public class PatternMatching_PredinedChar {

	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".");
		Matcher m = pattern.matcher("a7b @z#9");
		while(m.find()){
			System.out.println(m.start()+"------->"+m.group());
		}
	}
	
	
}
