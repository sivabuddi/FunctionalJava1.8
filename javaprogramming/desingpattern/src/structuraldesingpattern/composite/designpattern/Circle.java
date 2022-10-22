package structuraldesingpattern.composite.designpattern;

public class Circle implements Shape{


    @Override
    public void draw(String str) {
        System.out.println("Draw Circle with color ="+str);
    }
}
