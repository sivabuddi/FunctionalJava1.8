package streams;

import java.util.*;
import java.util.stream.*;
public class Fibonacci {
	
	public static void main(String[] args) {
		
	// Generate the fibonacci numbers	
		
	Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(10).map(n-> n[0]).forEach(p->System.out.println(p));
	
	// sum of fibonacci numbers
	
	System.out.println();
	
	int num = Stream.iterate(new int[] {0,1},n -> new int[] {n[1],n[0]+n[1]}).limit(10).map(n->n[0]).mapToInt(n->n).sum();
	System.out.print(num);
		
	}

}
