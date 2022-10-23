package creationaldesingpattern.abstract1.designpattern;

public class CentOSFactory implements OSAbstractFactory{
    @Override
    public OS createOS() {
        return new CentOS();
    }
}
