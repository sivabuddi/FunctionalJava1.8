package singleton;
import java.io.*;
class Super_Singletons implements Cloneable{
	
	
	int i =10;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	
		
	
}


class Singleton4 extends Super_Singleton{

	public  static Singleton4 instance = new Singleton4();
	
	
	private Singleton4() {
		
		
	}
	
	
	
	
}



public class Singleton_Cloning_break {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Singleton4 instance1 = Singleton4.instance;
		Singleton4 instance2 = (Singleton4)instance1.clone();
		
		System.out.println("Original Object =   "+ instance1.hashCode());
		System.out.println("Cloned Object =   "+instance2.hashCode());
		
	}
	
	

}
