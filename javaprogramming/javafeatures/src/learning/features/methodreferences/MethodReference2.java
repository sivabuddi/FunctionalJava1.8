package learning.features.methodreferences;

public class MethodReference2 {

    public  static void threadStatus(){
        System.out.println("Thread is running......");
    }

    public static void main(String[] args) {

        Sayable sayable = MethodReference2::threadStatus;
        sayable.say();

        Thread t = new Thread(MethodReference2::threadStatus);
        t.start();

    }

}
