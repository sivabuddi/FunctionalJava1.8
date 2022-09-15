package streams;

public class Employee {
	
	int empid,sal;
	String name;
	
	public Employee(int empid, String name, int sal) {
		
		this.empid = empid;
		this.name = name;
		this.sal=sal;
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
