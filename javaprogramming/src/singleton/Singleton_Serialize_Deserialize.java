package singleton;

import java.io.Serializable;
import java.io.*;
class Singleton1 implements Serializable{
	
	public static Singleton1 instance = new Singleton1();
	
	private Singleton1() {
				
		
	}
	
		
	
	
}


public class Singleton_Serialize_Deserialize {
	
	
	public static void main(String[] args) {
		
		Singleton1 instance1 = Singleton1.instance;
		
		
		try {
			
			// serializing the singleton object
			ObjectOutput output = new ObjectOutputStream(new FileOutputStream("testing1.txt"));
			output.writeObject(instance1);
			output.close();
			
			// Deserializing the singleton object
			ObjectInput input = new ObjectInputStream(new FileInputStream("testing1.txt"));
			Singleton1 instance2 = (Singleton1)input.readObject();
			input.close();
			
			
			System.out.println(instance1.hashCode());
			System.out.println(instance2.hashCode());
			
		}
		
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	
		
	}
	
	
	

}
