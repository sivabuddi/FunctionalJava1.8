package dependencyinversion.good;

public class ClientApp {

    public static void main(String[] args) {
        Car petrol=new Car(new PetrolEngine());
        Car diesel=new Car(new DieselEngine());
        petrol.start();
        diesel.start();
    }
}
