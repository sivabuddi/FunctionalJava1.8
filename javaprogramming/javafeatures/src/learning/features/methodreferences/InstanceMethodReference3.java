package learning.features.methodreferences;
import java.util.function.BiFunction;

class Arith{
    public int add(int a, int b){
        return a+b;
    }
}

public class InstanceMethodReference3 {

    public static void main(String[] args) {

        // Anonymous object referring non-static method
        BiFunction<Integer, Integer, Integer> biFunction= new Arith()::add;
        int result = biFunction.apply(10,20);
        System.out.println(result);

    }

}
