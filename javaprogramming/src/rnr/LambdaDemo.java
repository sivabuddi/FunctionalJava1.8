package rnr;

public class LambdaDemo {
	
	
	public interface MyInterface{
		void message();
	}

	
	public static void main(String[] args) {
		
	MyInterface myInterface = () -> {System.out.println("Im in MyInterface message method");};			
	myInterface.message();
	
	}

}
