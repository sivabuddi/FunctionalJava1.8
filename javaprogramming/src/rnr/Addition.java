package rnr;

interface AddOperation{
	
	int add(int a, int b);
}


public class Addition {

	public static void main(String[] args) {
		
		AddOperation add = (int a, int b) -> {return a+b;};
		int result = add.add(3, 4);
		System.out.println("Additon of two numbers= "+result);		
		
	}
	
	
}
