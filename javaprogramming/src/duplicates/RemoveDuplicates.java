package duplicates;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Students> list = new ArrayList();

        Students student = new Students();
        student.setId(1);
        student.setName("Alex Mike");
        student.setBirthdate("10/13/1998");
        list.add(student);

        Students student1 = new Students();
        student1.setId(1);
        student1.setName("Alex Mike");
        student1.setBirthdate("10/13/1998");

        list.add(student1);

        Students student2 = new Students();
        student2.setId(2);
        student2.setName("Mark Duong");
        student2.setBirthdate("8/28/2001");

        list.add(student2);

        System.out.println("duplicate ="+list.toString());

        List<Students> listWithoutDuplicates = list.stream().distinct().collect(Collectors.toList());

        System.out.println("withoutduplicate ="+listWithoutDuplicates.toString());


    }

}
