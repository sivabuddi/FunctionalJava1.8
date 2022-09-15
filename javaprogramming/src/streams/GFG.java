package streams;

import java.util.regex.*;
import java.util.*;
public class GFG {
	  
	    // Function to validate the password.
	
		private static String[] splitAlphaNumeric(String str) {
			return str.split("(?i)((?<=[A-Z])(?=\\d|_@))|((?<=\\d|_@)(?=[A-Z]))");
		}
	
	
	    public static boolean
	    isValidPassword(String password)
	    {
	    	
	    	
	    	String string[]=splitAlphaNumeric(password);
	    	
	        for (String str:string) {	        	
	        	System.out.println(str);
	        	
	        	if(str.equalsIgnoreCase("password"))
	        	  return false;
	        }
	    	
	    		    	    		    	
	        // Regex to check valid password.
	        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$"; 
	        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

	 

	        Matcher m = p.matcher(password);
	  
	        // Return if the password
	        // matched the ReGex
	        return m.matches();
	    }
	  
	    // Driver Code.
	    public static void main(String args[])
	    {
	  
	        // Test Case 1:
	        String str1 = "passord123@pass_word";
	        System.out.println(isValidPassword(str1));
	  
	        // Test Case 2:
//	        String str2 = "turkey90AAA=";
//	        System.out.println(isValidPassword(str2));

	    }


}
