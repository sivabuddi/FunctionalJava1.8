package singleton;
import java.io.*;

// Serializing the object
public class DeSerializable {
	
	
	public static void main(String[] args) {
		
		Employee emp =null;
		
		try {
			
			FileInputStream input = new FileInputStream("testing.txt");
			ObjectInputStream object_input = new ObjectInputStream(input);
			emp = (Employee)object_input.readObject();
			input.close();
			object_input.close();

		}
		catch(Exception e) {
			e.printStackTrace();			
		}
		
		System.out.println("Deserailzing employee");
		System.out.println("Name ="+emp.name);
		System.out.println("address ="+emp.address);
		System.out.println("Number ="+emp.number);
		System.out.println("SSN ="+emp.SSN);
		
		
						
	}
	
	
	

}
