package streams;

interface A{
	
	int test(int n);
}



class VariableCapture {
	
	
	public static void main(String[] args) {
		int number=10;
		
		A a = (int n) ->
		{
			int value = number+n;
			
			return value;
		};
		
		int result = a.test(25);
		System.out.println(result);
		
	}

}
