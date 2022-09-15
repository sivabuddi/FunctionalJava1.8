package singleton;

import java.io.Serializable;
import java.io.*;
class Singleton20 implements Serializable{
	
	public static Singleton20 instance = new Singleton20();
	
	private Singleton20() {	
		
	}
	
	
	protected Object readResolve() {
		
		return instance;
	}
	
}


public class Singleton_Serialize_Deserialize2 {
	
	
	public static void main(String[] args) {
		
		Singleton20 instance1 = Singleton20.instance;
		
		
		try {
			
			// serializing the singleton object
			ObjectOutput output = new ObjectOutputStream(new FileOutputStream("testing1.txt"));
			output.writeObject(instance1);
			output.close();
			
			// Deserializing the singleton object
			ObjectInput input = new ObjectInputStream(new FileInputStream("testing1.txt"));
			Singleton20 instance2 = (Singleton20)input.readObject();
			input.close();
			
			
			System.out.println(instance1.hashCode());
			System.out.println(instance2.hashCode());
			
		}
		
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	
		System.out.println("Hello world");
		
	}
	
	
	

}
