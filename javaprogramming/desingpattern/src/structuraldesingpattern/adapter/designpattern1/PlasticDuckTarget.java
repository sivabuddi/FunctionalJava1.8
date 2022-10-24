package structuraldesingpattern.adapter.designpattern1;

public class PlasticDuckTarget implements Duck_Target {
    @Override
    public void squeak() {
        System.out.println("Plastic Duck sounds like Squeak...");
    }
}
