package structuraldesingpattern.composite.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        this.shapes.add(shape);
    }

    public void remove(Shape shape){
        shapes.remove(shape);
    }

    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }

    @Override
    public void draw(String str) {
        for(Shape shape:shapes)
            shape.draw(str);
    }


}
