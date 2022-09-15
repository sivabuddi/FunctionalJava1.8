package singleton;
public class Employee implements java.io.Serializable{
	
	public String name;
	public String address;
	public int number;
	public transient int SSN;
	
	public void verify_mail() {
		
		System.out.println("Mail to"+name+" "+address);
		
	}
	
}
