package rnr;

interface A{
	
	default void message() {
		System.out.println("Im in A class message method");
		
	}
}


interface B{
	
	default void message() {
		
		System.out.println("Im in B class message method");
	}
}

class DefaultMethods implements A, B {
	
	public void message() {
	  A.super.message();	
	}
	
	
	
	public static void main(String[] args) {
		
		DefaultMethods d = new DefaultMethods();
		d.message();
		
 }
	
 

}
