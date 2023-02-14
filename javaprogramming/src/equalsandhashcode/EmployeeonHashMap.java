package equalsandhashcode;

/*Reference:
        https://www.geeksforgeeks.org/override-equalsobject-hashcode-method/*/

import duplicates.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EmployeeonHashMap {

    private int id;
    private String name;

    public EmployeeonHashMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this ==obj)
            return true;
        if(obj==null || getClass() !=obj.getClass() )
            return false;
        EmployeeonHashMap emp = (EmployeeonHashMap) obj;
        return this.id == emp.id && this.name.equals(emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {

        EmployeeonHashMap emp1= new EmployeeonHashMap(11,"sivakumar");
        EmployeeonHashMap emp2= new EmployeeonHashMap(11,"sivakumar");

        Map<EmployeeonHashMap, String> map= new HashMap<>();
        map.put(emp1,"CSE");
        map.put(emp2,"IT");


        for(EmployeeonHashMap emp:map.keySet())
            System.out.println(map.get(emp).toString());

    }


}
