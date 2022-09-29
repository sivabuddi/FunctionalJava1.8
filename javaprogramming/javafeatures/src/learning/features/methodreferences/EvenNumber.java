package learning.features.methodreferences;

import java.util.function.Predicate;

interface Maths{
    boolean findEven(int number);
}

public class EvenNumber {

    public static boolean calculate(int number){
        return number>10;
    }

    public static void main(String[] args) {
        Maths maths =EvenNumber::calculate;
        boolean result =maths.findEven(10);
        System.out.println("Final result ="+result);

    }


}
