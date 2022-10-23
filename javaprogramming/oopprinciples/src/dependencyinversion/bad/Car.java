package dependencyinversion.bad;

public class Car {

    private  Engine engine; // object composition

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.begin();
    }
}
