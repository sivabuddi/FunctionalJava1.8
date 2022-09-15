package singleton;

import java.io.ObjectOutputStream;

// Serializing the object
public class Serializable {
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name ="Siva Kumar";
		emp.address ="Overland park, Kansas";
		emp.SSN =123456789;
		emp.number = 134;
		
		try {
			
			java.io.FileOutputStream output = new java.io.FileOutputStream("testing.txt");
			ObjectOutputStream object_output = new ObjectOutputStream(output);
			object_output.writeObject(emp);
			object_output.close();
			output.close();
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
		
						
	}
	
	
	

}
