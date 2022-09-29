package learning.features.methodreferences;
import learning.features.Interface3;
import java.util.function.BiFunction;

class Arithmetics{

    public static int add(int a, int b){
        return a+b;
    }

    public static float add(int a, float b){
        return a+b;
    }

    public static float add(float a, int b){
        return a+b;
    }

}

public class OverrideStatic {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction1 = Arithmetics::add;
        BiFunction<Integer, Float, Float> biFunction2 = Arithmetics::add;
        BiFunction<Float, Integer, Float> biFunction3 = Arithmetics::add;

        int result1= biFunction1.apply(10,20);
        float result2 =biFunction2.apply(12,23.2f);
        float result3 =biFunction3.apply(23.4f, 12);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);



    }

}
