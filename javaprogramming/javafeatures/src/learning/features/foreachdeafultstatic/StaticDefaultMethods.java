package learning.features.foreachdeafultstatic;

public class StaticDefaultMethods implements Interface1, Interface2{


    @Override
    public void method1(String str) {

    }

    @Override
    public void log(String str) {
        System.out.println("StaticDefaultMethods logging "+str);
        Interface1.super.log(str);
    }

    @Override
    public void method2(String str) {

    }


    public static void main(String[] args) {

        Interface1 interface1 = new StaticDefaultMethods();
        interface1.log("sivakumar from ");

    }



}
