package learning.features.methodreferences;

interface Addition1{
    int add(int a, int b);
}


public class MethodRefAddition {

    public int addtion(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        // Demo on performing addition of two numbers using method reference operator
        Addition1 addition1 = new MethodRefAddition()::addtion;
        int result =addition1.add(10,20);
        System.out.println("Addition of two numbers ="+result);

        // Demo on performing addition of two numbers using without using method reference operator
        Addition1 addition12 = (int a, int b) ->{return a+b;};
        int result2 =addition12.add(40,20);
        System.out.println(result2);





    }

}
