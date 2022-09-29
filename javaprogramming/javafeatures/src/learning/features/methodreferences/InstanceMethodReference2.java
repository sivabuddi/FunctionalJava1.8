package learning.features.methodreferences;

public class InstanceMethodReference2 {

    public void saySomething(){
        System.out.println(" Im non-static method of InstanceMethodReference2");
    }

    public static void main(String[] args) {

        // non-static method referring using anonymous object
        Thread t = new Thread(new InstanceMethodReference2()::saySomething);
        t.start();

    }

}
