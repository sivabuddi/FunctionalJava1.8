package creationaldesingpattern.abstract1.designpattern;

public class OSFactory {

    public static OS getOS(OSAbstractFactory osAbstractFactory){
        return osAbstractFactory.createOS();
    }

}
