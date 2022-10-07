package learning.concurrentcollections;
import java.util.ArrayList;
import java.util.concurrent.*;

// Constructors and Methods in CopyOnWriteArrayList
public class CopyOnWriteArrayList1 {

    public static void main(String[] args) {

        CopyOnWriteArrayList copy = new CopyOnWriteArrayList();

        copy.add("A");
        copy.add("A");
        copy.add("C");

        copy.addIfAbsent("D");
        copy.addIfAbsent("D");

        System.out.println(copy);

        ArrayList arrayList= new ArrayList();
        arrayList.add("P");
        arrayList.add("Q");

        CopyOnWriteArrayList copyOnWriteArrayList1 = new CopyOnWriteArrayList();
        copyOnWriteArrayList1.add("P");
        copyOnWriteArrayList1.add("R");

        System.out.println(copyOnWriteArrayList1);

        copyOnWriteArrayList1.addAll(arrayList);

        System.out.println(copyOnWriteArrayList1);

        ArrayList arrayList2 =new ArrayList();
        arrayList2.add("P");
        arrayList2.add("S");

        copyOnWriteArrayList1.addAllAbsent(arrayList2);
        System.out.println(copyOnWriteArrayList1);




    }
}
