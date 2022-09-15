package interviewquestions;
import java.io.*;
import java.util.Scanner;
public class PasswordVerification {
	
	public  static String [] split_input(String input) {
						
		return input.split("(?i)((?<=[A-Z])(?=\\d|_|@))|((?<=\\d|_|@)(?=[A-Z]))");
	}
	
	
	public static boolean  simplePassword(String input) {
		
		System.out.println(input.getClass().getSimpleName());
		String str[] = split_input(input);
		
		for(String string:str) {
			System.out.println(string);	
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		 System.out.println("Enter the string");
		 Scanner sc = new Scanner(System.in);
		 System.out.println(PasswordVerification.simplePassword(sc.nextLine()));		
	}

}
