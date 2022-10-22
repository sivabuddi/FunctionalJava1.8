package structuraldesingpattern.bridge.designpattern;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("red");
    }
}
