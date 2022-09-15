package singleton;
import java.io.*;
class Super_Singleton implements Cloneable{
	
	
	int i =10;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
		
	
}


class Singleton3 extends Super_Singleton{

	public  static Singleton3 instance = new Singleton3();
	
	
	private Singleton3() {
		
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		
		return instance;
	}
	
	
}



public class Singleton_Cloning {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Singleton3 instance1 = Singleton3.instance;
		Singleton3 instance2 = (Singleton3)instance1.clone();
		
		System.out.println("Original Object =   "+ instance1.hashCode());
		System.out.println("Cloned Object =   "+instance2.hashCode());
		
	}
	
	

}
