package streams;

import java.util.stream.*;
import java.util.Arrays;
public class InitializeArray {
	
	
	public static void main(String[] args) {
		
		int n =10;
		int arr[]= IntStream.iterate(1, i -> i+1).limit(n).toArray();
		for(int i:arr)
			System.out.print(i+" ");
		
		//System.out.println(Arrays.toString(arr));
		
		
	}
	

}
