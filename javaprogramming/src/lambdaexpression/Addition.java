package lambdaexpression;

interface Arithmetic{
	int add(int a, int b);
}

public class Addition {
	
	public static void main(String[] args) {	
		Arithmetic ref = (int a, int b) ->{return a+b;};
		System.out.println("Addition of two numbers ="+ref.add(12,23));
			
	}
	

}
