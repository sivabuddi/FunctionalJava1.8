package immutbale;
import java.util.*;
final class Student{
	
	// private and final data members
	
	private final int regNo;
	private final String name;
	private final Map<String, String> metadata;
	
	
	
	public Student(String name, int regNo, Map<String, String> metadata) {
		
		this.name = name;
		this.regNo = regNo;
		
		Map<String, String> map  = new HashMap<String, String>();
		
		
		// iterating 
		
		for(Map.Entry<String, String> entry: metadata.entrySet()) {
			map.put(entry.getKey(), entry.getValue());
		}
		
		this.metadata = map;
		
	}// constructor
	
	
	
	// getters
	
	public String getName() {
		
		return name;
	}
	
	
	public int getRegNo() {
		return regNo;
	}
	
	
	public Map<String, String> getMetadata(){
		
		Map<String, String> map = new HashMap<String, String>();
		
		for(Map.Entry<String, String> entry:this.metadata.entrySet()) {
			map.put(entry.getKey(), entry.getValue());
		}
		
		return map;
		
	}
	
}


public class Immutable_Class {
	
	public static void main(String[] args) {
			
		Map<String, String> map =new HashMap<String, String>();
		map.put("1", "ABC");
		map.put("2", "EDF");
		
		Student student = new Student("sivakumar",8745, map);
		
		System.out.println(student.getRegNo());
		System.out.println(student.getName());
		System.out.println(student.getMetadata());
		
		map.put("3","IJK");
		

		System.out.println(student.getMetadata());
		
		
		map.put("4", "MNO");
		
		System.out.println(student.getMetadata());
		
	}

}
