package learning.features.methodreferences;
import java.util.function.BiFunction;

class Arithmetic{

    public static int addition(int a, int b){
        return a+b;
    }

}

public class PreDefinedFuncational {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction = Arithmetic::addition;
        int result = biFunction.apply(10,20);
        System.out.println("Addition of two numbers ="+result);



    }


}
