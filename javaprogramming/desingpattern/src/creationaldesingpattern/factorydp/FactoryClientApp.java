package creationaldesingpattern.factorydp;

public class FactoryClientApp {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("PC","2 GB","SATA", "2.4HZ");
        Computer server = ComputerFactory.getComputer("SERVER","4 GB","Magnetic", "4.5Hz");

        System.out.println("PC Information "+pc);
        System.out.println("SERVER Information "+server);

    }
}
