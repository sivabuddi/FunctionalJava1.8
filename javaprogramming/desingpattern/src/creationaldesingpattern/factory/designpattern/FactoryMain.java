package creationaldesingpattern.factory.designpattern;

public class FactoryMain {

    public static void main(String[] args) {

//        OS obj = new RedHat();
//        obj.spec();

//        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = OperatingSystemFactory.getInstanceOS("close");
        obj.spec();

    }

}
