package creationaldesingpattern.prototype.designpattern;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException{

        Employee employee= new Employee();
        employee.loadData();
        System.out.println(employee.getEmpList());

        Employee employee1 =(Employee) employee.clone();
        Employee employee2=(Employee) employee.clone();


        List<String> emp1= employee1.getEmpList();
        emp1.add("Prakasam");

        List<String> emp2 = employee2.getEmpList();
        emp2.add("Krishna");

        System.out.println(emp1);
        System.out.println(emp2);

    }

}
