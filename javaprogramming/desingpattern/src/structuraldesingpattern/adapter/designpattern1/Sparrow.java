package structuraldesingpattern.adapter.designpattern1;

public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("Birds Flying...");

    }

    @Override
    public void makeSound() {
        System.out.println("Birds sound like chirp chirp...");
    }
}
