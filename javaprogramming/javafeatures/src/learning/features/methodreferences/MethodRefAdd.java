package learning.features.methodreferences;

public class MethodRefAdd {

    public static int addition(int a, int b){
        return a+b;
    }

    public  int addition1(int a, int b){
        return a+b;
    }


    public static void main(String[] args) {

        // Replacing lambda expression with method reference operator
        ArithmeticTest arithmeticTest=MethodRefAdd::addition;
        System.out.println(arithmeticTest);
        int result = arithmeticTest.add(1,2);
        System.out.println(result);


        // Replacing lambda expression with method reference operator with non-static method
        ArithmeticTest arithmeticTest2 = new MethodRefAdd()::addition1;
        System.out.println(arithmeticTest2);
        int result3 = arithmeticTest2.add(2,3);
        System.out.println(result3);



        // With Lambda Expressions
        ArithmeticTest arithmeticTest1 = (int a, int b) -> {return a+b;};
        System.out.println(arithmeticTest1);
        int result1 = arithmeticTest1.add(1,2);
        System.out.println(result1);

    }

}
