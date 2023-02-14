package equalsandhashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*Reference: https://medium.com/@pulapaphani/why-overriding-equals-and-hashcode-in-java-b5f869f985d2*/
public class Employee {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && name.equals(employee.name);
    }

/*    @Override
    public int hashCode() {
        final int PRIME=31;
        int result =1;
        result = PRIME*result + this.id;
        return result;
    }
*/

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public static void main(String[] args) {

        Employee emp1= new Employee(11, "sivakumar");
        Employee emp2= new Employee(11,"sivakumar");
//        Employee emp2= null;

        boolean result = emp1.equals(emp2);
        System.out.println(result);

        System.out.println("Hashcode of emp1: "+emp1.hashCode());
        System.out.println("Hashcode of emp2: "+emp2.hashCode());


        Set<Employee> setEmployee = new HashSet<>();
        setEmployee.add(emp1);
        setEmployee.add(emp2);
        System.out.println(setEmployee);


    }

}
