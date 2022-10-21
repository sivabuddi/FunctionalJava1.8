package factory.designpattern;

// Factory DP: The factory pattern takes out the responsibility
// of instantiating a object from the class to a Factory class.
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
