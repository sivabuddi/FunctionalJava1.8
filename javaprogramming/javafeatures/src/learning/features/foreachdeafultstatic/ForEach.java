package learning.features.foreachdeafultstatic;
import java.util.*;
import java.util.function.Consumer;

public class ForEach {


    public static void main(String[] args) {

        // create collection

        List<Integer> list =new ArrayList<>();

        for(int i=0;i<10;i++)
            list.add(i); // auto boxing converting primitive to wrapper class objects

        System.out.println(list);

        // method 1 : Traversing through iterator without forEach

        Iterator<Integer> iterator= list.iterator();

        while(iterator.hasNext()){
            Integer integer= iterator.next();
            System.out.println("Integer value"+integer);
        }



        // method 2: Traversing through forEach method of Iterable with anonymous classes

        list.forEach(

                new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println("forEach through anonymous class"+integer);
                    }
                }
        );


        // method3: Traversing with Consumer Interface Implementation

        MyConsumer myConsumer=new MyConsumer();
        list.forEach(myConsumer); // Here we keep the business logic separate from forEach


    }


}


class MyConsumer implements  Consumer<Integer>{

    @Override
    public void accept(Integer integer) {

        System.out.println("Consumer Interface implemented with accept method"+integer);

    }
}