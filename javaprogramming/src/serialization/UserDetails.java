package serialization;

import java.io.*;
public class UserDetails  implements  Externalizable{

    private String name;
    private int age;
    private float salary;

    private String password;
    private String SSN;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject("Siva Kumar Buddi");
        out.writeInt(35);
        out.writeFloat(95000.5f);

        out.writeObject(" ");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
         name = (String)in.readObject();
         age =in.readInt();
         salary = in.readFloat();
         password = (String)in.readObject();
    }


}
