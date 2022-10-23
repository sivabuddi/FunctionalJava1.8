package creationaldesingpattern.abstract1.designpattern;

public class ScientificLinuxFactory implements OSAbstractFactory{
    @Override
    public OS createOS() {
        return new ScientificLinux();
    }
}
