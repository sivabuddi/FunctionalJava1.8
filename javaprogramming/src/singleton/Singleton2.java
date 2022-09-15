package singleton;

public class Singleton2 {

	
	public static Singleton2 instance = new Singleton2();
	
	
	// private constructor
	
	private Singleton2() {
		
		
		if( instance != null ) {
	        throw new InstantiationError( "Creating of this object is not allowed." );
	    }
		
		
	}
	
	
}
