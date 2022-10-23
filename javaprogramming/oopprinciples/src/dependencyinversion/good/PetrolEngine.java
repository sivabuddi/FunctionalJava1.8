package dependencyinversion.good;

public class PetrolEngine implements  Engine{
    @Override
    public void begin() {
        System.out.println("Petrol Engine begins....");
    }
}
