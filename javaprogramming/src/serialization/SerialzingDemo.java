package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialzingDemo {

    public static void main(String[] args) throws Exception, IOException {

        // write the data in to the stream using serializable interface

        FileOutputStream file = new FileOutputStream("Testing1");

        Employee employee = new Employee();
        employee.setEmpname("Siva Kumar Buddi");
        employee.setAge(36);
        employee.setSalary(345678.34f);
        employee.setSSN(345654987);

        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(employee);
        out.close();
        file.close();




    }

}
