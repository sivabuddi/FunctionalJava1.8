package learning.features.foreachdeafultstatic;

public class FunctionLambdaExp {

    public static void main(String[] args) {

        // Procedure 1 which is functional interface having only one abstract method run
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class instantiating the Funcational Interface ");
            }
        };

        runnable.run();

        // Procedure 2  which is functional interface having only one abstract method run

        Runnable runnable1 = () ->{
               System.out.println("Lambda Expression instantiating the Functional Interface");
        };


        runnable1.run();

        Interface3 interface3 = (s) ->System.out.println(s);

        interface3.method("Labmda Expression with Argument");

    }
}
