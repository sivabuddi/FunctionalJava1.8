package javabasics;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int arr[] = {11,22,79,10,23,76,289};
		
		int largest  = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		
		int len  = arr.length;
		
		for(int i =0;i<len;i++) {
			largest = Math.max(largest, arr[i]);
		}
		
		System.out.println("First largest ="+largest);
		
		
		for(int j=0;j<len;j++) {
			if(arr[j]!=largest)
				second_largest=Math.max(second_largest, arr[j]);
		}
		
		
		System.out.println("Second Largest="+second_largest);
		
	}

}
