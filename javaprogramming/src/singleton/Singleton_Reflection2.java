package singleton;
import java.lang.reflect.Constructor;
public class Singleton_Reflection2 {
	
	
	public static void main(String[] args) {
		
		
		Singleton2 reflect1 = Singleton2.instance;
		Singleton2 reflect2 = null;
		
		
		try {
			
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			
			for(Constructor x: constructors) {
				// destroy the singleton pattern of a class
				x.setAccessible(true);
				reflect2 =(Singleton2)x.newInstance();
				//break;
			}
				 
			
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		System.out.println(reflect1.hashCode());
		System.out.print(reflect2.hashCode());
		
		
	}
	

}
