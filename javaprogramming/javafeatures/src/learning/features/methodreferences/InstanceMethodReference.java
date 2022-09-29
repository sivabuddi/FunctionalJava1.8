package learning.features.methodreferences;
public class InstanceMethodReference {

    public void saySomething(){
        System.out.println(" Im  belongs to non static method of InstanceMethodReference");
    }
    

    public static void main(String[] args) {

        // calling non-static method using reference
        InstanceMethodReference instanceMethodReference =new InstanceMethodReference();
        Sayable sayable= instanceMethodReference::saySomething;
        sayable.say();

        // calling non-static method using anonymous object
        Sayable sayable1 = new InstanceMethodReference()::saySomething;
        sayable1.say();



    }

}
