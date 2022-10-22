package structuraldesingpattern.bridge.designpattern;

public abstract class Shape {

    protected Color color; // object level composition
    public abstract void applyColor();

    public Shape(Color color) {
        this.color = color;
    }
}
