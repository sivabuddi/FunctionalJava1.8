package singleton;
import java.lang.reflect.Constructor;
public class Singleton_Reflection {
	
	
	public static void main(String[] args) {
		
		
		Singleton reflect1 = Singleton.instance;
		Singleton reflect2 = null;
		
		
		try {
			
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			
			for(Constructor x: constructors) {
				// destroy the singleton pattern of a class
				x.setAccessible(true);
				reflect2 =(Singleton)x.newInstance();
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
