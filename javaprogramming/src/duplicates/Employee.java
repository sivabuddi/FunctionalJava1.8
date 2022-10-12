package duplicates;

import java.util.Objects;

public class Employee {

    int empid;


    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empid == employee.empid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                '}';
    }
}
