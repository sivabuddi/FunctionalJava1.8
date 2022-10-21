package factory.designpattern;

public class OperatingSystemFactory {

    public OS getInstanceOS(String str){
        if(str.equals("open"))
            return new RedHat();
        else if(str.equals("close"))
            return new Ubuntu();
        else
            return new IOS();

    }
}
