package interviewquestions;

public class Person {
	
	public Person(String id, String personName, int sal) {
		super();
		this.id = id;
		this.personName = personName;
		this.sal = sal;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		return person.getId().equals(this.getId());
	}
	
	
	@Override
	public int hashCode() {
		return this.getId().hashCode();
	}
	
	
	@Override
	public String toString() {
		
		return "["+this.getId()+ "FirstName"+this.getPersonName()+ "Salary"+this.getSal()+"]";
		
	}
	
	
	String id, personName;
	int sal;

}
