package factory.designpattern;

public class FactoryMain {

    public static void main(String[] args) {

//        OS obj = new RedHat();
//        obj.spec();

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstanceOS("close");
        obj.spec();

    }

}
