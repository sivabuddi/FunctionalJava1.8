package abstracts.design;
// https://www.digitalocean.com/community/tutorials/abstract-factory-design-pattern-in-java
public class AbstractDPTest {

    public static void main(String[] args) {

        testDesignPatternofAbstract();

    }

    public static void testDesignPatternofAbstract(){
        Computer pc=ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("Abstract Factory PC Config:"+pc);
        System.out.println("Abstract Factory Server Config:"+server);
        return;
    }
}
