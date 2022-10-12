package learning.features.methodreferences;

// we have defined a functional interface Sayable and referring a static method to it's functional method say().
public class MethodReference {

    public static void saySomething(){
        System.out.println("Im in static method of MethodReference name saySomething");
    }

    public static void main(String[] args) {

        // Without using method reference
        Sayable sayable1 =() ->{System.out.println("Im in static method of MethodReference name saySomething");};
        System.out.println(sayable1);
        sayable1.say();

        Sayable sayable2 = MethodReference::saySomething;
        System.out.println(sayable2);
        sayable2.say();



    }


}
