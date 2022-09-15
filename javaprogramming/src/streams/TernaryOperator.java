package streams;

interface Testing{
	
	public int test(int a);
}


public class TernaryOperator {
	
	public static void main(String[] args) {	
		Testing t = (int n) -> (n%2==0)? n/2:n/2+1;   
		int result=t.test(32);
		System.out.println(result);
		
	}

}
