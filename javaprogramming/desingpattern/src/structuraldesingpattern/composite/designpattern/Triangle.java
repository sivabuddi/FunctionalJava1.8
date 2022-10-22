package structuraldesingpattern.composite.designpattern;

public class Triangle implements Shape{

    @Override
    public void draw(String str) {
        System.out.println("Drawing Triangle with Color ="+str);
    }
}
