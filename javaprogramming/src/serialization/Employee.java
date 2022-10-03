package serialization;

import java.io.*;

public class Employee implements Serializable {

    private String empname;
    private int age;
    private float Salary;

    // If you don't want to send the sensitive information over network, declare variable as transient
    private transient int SSN;


    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }


}
