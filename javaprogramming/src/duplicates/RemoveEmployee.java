package duplicates;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmployee {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setEmpid(123);

        Employee employee2 = new Employee();
        employee2.setEmpid(132);

        Employee employee3 = new Employee();
        employee3.setEmpid(144);

        Employee employee4 = new Employee();
        employee4.setEmpid(132);

        list.add(employee1);
        list.add(employee2); list.add(employee3); list.add(employee4);

        System.out.println(list.toString());

        List<Employee> unique_elements = list.stream().distinct().collect(Collectors.toList());
        System.out.println(unique_elements.toString());



        }

    }


