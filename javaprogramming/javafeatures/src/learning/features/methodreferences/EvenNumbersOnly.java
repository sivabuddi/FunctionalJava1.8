package learning.features.methodreferences;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.function.Predicate;

interface Testing{
    void evens(Integer[] array);
}

public class EvenNumbersOnly {

    public static void main(String[] args) {
        Integer array[]={11,22,33,44,55,66,77};
        System.out.println("Using method reference Operator");
        Testing testing= EvenNumbersOnly::even;
        testing.evens(array);
        System.out.println("Passing method reference operator to method as an argument");
        display1(testing,array);
        System.out.println("Using Lambda Expression without using Reference Operator");
        display((s) -> s%2==0, array);
    }


    private static void even(Integer[] integer) {
        for(Integer integer1:integer){
            if(integer1%2==0)
             System.out.println(integer1);
        }

    }

    public static void display1(Testing testing, Integer[] array){
       testing.evens(array);
    }


    public static void display(Predicate<Integer> predicate, Integer[] array){

        for(Integer i:array){
            if(predicate.test(i))
                System.out.println(i);
        }


    }

}
