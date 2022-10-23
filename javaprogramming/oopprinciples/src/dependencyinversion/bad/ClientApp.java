package dependencyinversion.bad;

public class ClientApp {

    public static void main(String[] args) {

        Engine engine = new Engine();
        Car car = new Car(engine);
        car.start();


    }

}
