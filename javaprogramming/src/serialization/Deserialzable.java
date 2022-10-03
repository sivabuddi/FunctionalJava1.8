package serialization;

import java.io.*;

public class Deserialzable {

    public static void main(String[] args) throws Exception, IOException {

        Employee employee = null;
        FileInputStream file = new FileInputStream("Testing1");
        ObjectInputStream input = new ObjectInputStream(file);

        // deserialize the object
        employee = (Employee) input.readObject();

        System.out.println("After Deserialzing Employee Object Information");

        System.out.println(employee.getEmpname());
        System.out.println(employee.getAge());
        System.out.println(employee.getSalary());
        System.out.println(employee.getSSN());


    }

}
