package rnr;

interface MyInterface1{
	void message();
}


public class LambdaDemo1 {
	
	public static void main(String[] args) {
		
	MyInterface1 myInterface = () -> {System.out.println("Im in MyInterface1 message method");};			
	myInterface.message();
	
	}

}
