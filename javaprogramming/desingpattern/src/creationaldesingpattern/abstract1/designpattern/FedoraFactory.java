package creationaldesingpattern.abstract1.designpattern;

public class FedoraFactory implements OSAbstractFactory{
    @Override
    public OS createOS() {
        return new Fedora();
    }
}
