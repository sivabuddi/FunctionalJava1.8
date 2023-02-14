package duplicates;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveServantsDuplicates {

    public static void main(String[] args) {

        List<Servant> servantList = new ArrayList<>();
        Servant servant1= new Servant();
        servant1.setServantId(101);


        Servant servant2= new Servant();
        servant2.setServantId(102);


        Servant servant3= new Servant();
        servant3.setServantId(103);


        Servant servant4 =new Servant();
        servant4.setServantId(101);


        servantList.add(servant1);
        servantList.add(servant2);
        servantList.add(servant3);
        servantList.add(servant4);

        System.out.println(servantList);
        List<Servant> unique_servant= servantList.stream().distinct().collect(Collectors.toList());
        System.out.println(unique_servant);



    }
}
