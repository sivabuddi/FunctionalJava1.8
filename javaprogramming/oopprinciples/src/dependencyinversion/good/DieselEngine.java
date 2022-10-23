package dependencyinversion.good;

public class DieselEngine implements Engine {
    @Override
    public void begin() {
        System.out.println("Diesel Engine begins ...");
    }
}
