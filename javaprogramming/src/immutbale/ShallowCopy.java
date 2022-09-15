package immutbale;

import java.util.Arrays;
// cloning is best example for shallow copy
// Shallow copy is same as call by reference in  C and C++
public class ShallowCopy {
	private int [] data;
	public ShallowCopy(int [] values) {
		data = values;
	}
	
	
	public void showData() {
		
		System.out.println(Arrays.toString(data));
	}
	
	public static void main(String[] args) {
		int [] values = {11,22,33};
		ShallowCopy shallow = new ShallowCopy(values);
		shallow.showData();
		values[0] = 44;
		shallow.showData();
	}
	
}
