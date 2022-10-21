package factory.designpattern;

// Factory DP: The factory pattern takes out the responsibility
// of instantiating a object from the class to a Factory class.

// OR

//The factory design pattern is used when we have a superclass with multiple subclasses
// and based on input, we need to return one of the subclass. This pattern takes out the
// responsibility of the instantiation of a class from the client program to the factory class.
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
