package structuraldesingpattern.bridge.designpattern;

public class ClientApp {

    public static void main(String[] args) {

        Shape triangle= new Triangle(new RedColor());
        Shape pentagon= new Pentagon(new GreenColor());

        triangle.applyColor();
        pentagon.applyColor();


    }
}
