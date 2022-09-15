package singleton;

public class SingletonFirst {
	
	
	private static SingletonFirst single_instance = null;
	public String s;
	
	private SingletonFirst() {
		 
		s = "first singleton object is created";
		
	}
	
	
	public static SingletonFirst getSingletonDemos() {
		
		
		if(single_instance == null)
			single_instance = new SingletonFirst();
		
		
		return single_instance;
		
	}
	

}
