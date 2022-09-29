package learning.features.methodreferences;

// we have defined a functional interface Sayable and referring a static method to it's functional method say().
public class MethodReference {

    public static void saySomething(){
        System.out.println("Im in static method of MethodReference name saySomething");
    }

    public static void main(String[] args) {

        Sayable sayable = MethodReference::saySomething;
        System.out.println(sayable);
        sayable.say();

    }


}
