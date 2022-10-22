package prototype.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> empList;

    public Employee(){
        empList = new ArrayList<String>();
    }

    public Employee(List<String> empList) {
        this.empList = empList;
    }

    public void loadData(){
        empList.add("Siva");
        empList.add("Kumar");
        empList.add("Buddi");
        empList.add("India");
    }

    public List<String> getEmpList(){
        return empList;
    }

    @Override
    public  Object clone() throws CloneNotSupportedException{
        List<String> list =new ArrayList<>();

        for(String str:this.getEmpList())
            list.add(str);

        return new Employee(list);
    }

}
