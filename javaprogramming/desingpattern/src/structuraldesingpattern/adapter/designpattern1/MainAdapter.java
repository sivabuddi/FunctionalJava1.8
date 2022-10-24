package structuraldesingpattern.adapter.designpattern1;

public class MainAdapter {

    public static void main(String[] args) {

        Sparrow sparrow =new Sparrow();
        System.out.println("Sparrow");
        sparrow.fly();
        sparrow.makeSound();


        Duck_Target duck_target= new PlasticDuckTarget();
        System.out.println("Plastic Duck");
        duck_target.squeak();

        System.out.println("----Adapter Conversion----");

        Duck_Target duck_target1= new BirdAdapter(sparrow);
        duck_target1.squeak();



    }
}
