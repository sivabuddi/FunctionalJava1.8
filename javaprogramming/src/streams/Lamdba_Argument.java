package streams;

@FunctionalInterface
interface TestInterface{
	boolean test(int a);
}


class Test{
	
	public static boolean check(TestInterface t, int a) {
		return t.test(a);
	}
	
	
}



public class Lamdba_Argument {

	public static void main(String[] args) {
		
		boolean result = Test.check((x) -> x%2==0, 10);
		System.out.print(result);
	}
	
	
}
