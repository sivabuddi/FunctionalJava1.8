package immutbale;

import java.util.Arrays;
// Deep copy is same as String class
// Deep copy is same as call by value in C and C++
public class DeepCopy {
	
	private int [] data;
	
	public DeepCopy(int [] values) {
		data = new int [values.length];
		for(int i=0;i<data.length;i++)
			data[i] = values[i];
		
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
	
	public static void main(String[] args) {
		
		int [] values = {11,22,33};
		DeepCopy deep  = new DeepCopy(values);
		deep.showData();
		values[0] = 44;
		deep.showData();
	}	
	
	
}
