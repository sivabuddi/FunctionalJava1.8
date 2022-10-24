package structuraldesingpattern.adapter.designpattern1;

public class BirdAdapter implements Duck_Target {

    // Object level Composition
    Bird bird; // Adoptee

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
