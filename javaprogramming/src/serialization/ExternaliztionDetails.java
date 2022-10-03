package serialization;
import java.io.*;
public class ExternaliztionDetails {

    public static void main(String[] args) throws Exception, IOException{

        File file=new File("Testing");

        // Serialization using   Externalizable interface

        UserDetails userDetails = new UserDetails();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(userDetails);

        // Deserializable using Externalizable interface
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        System.out.println("After Deserialization  actual object information");
        userDetails =(UserDetails) input.readObject();

        System.out.println("Employee name="+userDetails.getName());
        System.out.println("Age= "+userDetails.getAge());
        System.out.println("Salary = "+userDetails.getSalary());
        System.out.println("Password = "+userDetails.getPassword());
        System.out.println("SSN = "+userDetails.getSSN());










    }
}
