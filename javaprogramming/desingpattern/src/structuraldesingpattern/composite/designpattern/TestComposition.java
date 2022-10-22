package structuraldesingpattern.composite.designpattern;
import  structuraldesingpattern.composite.designpattern.Triangle;
import  structuraldesingpattern.composite.designpattern.Drawing;

public class TestComposition {


    public static void main(String[] args) {


        Shape triangle=new Triangle();
        Shape circle= new Circle();

        Drawing drawing= new Drawing();
        drawing.add(triangle);
        drawing.add(circle);
        drawing.draw("Red");

        drawing.clear();

        Shape triangle1= new Triangle();
        drawing.add(triangle1);
        drawing.add(circle);

        drawing.draw("Green");

        drawing.clear();
    }






}
