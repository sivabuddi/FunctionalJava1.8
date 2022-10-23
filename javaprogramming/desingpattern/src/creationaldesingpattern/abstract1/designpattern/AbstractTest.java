package creationaldesingpattern.abstract1.designpattern;

public class AbstractTest {

    public static void main(String[] args) {

        OS fedora = OSFactory.getOS(new FedoraFactory());
        OS centos= OSFactory.getOS(new CentOSFactory());
        OS scientficlinux=OSFactory.getOS(new ScientificLinuxFactory());
        fedora.specifications();
        centos.specifications();
        scientficlinux.specifications();

    }
}
