package creationaldesingpattern.abstracts.design;

// If you are familiar with factory design pattern in java, you will notice that we have a
// single Factory class. This factory class returns different subclasses based on the input
// provided and factory class uses if-else or switch statement to achieve this. In the Abstract
// Factory pattern, we get rid of if-else block and have a factory class for each subclass.
// Then an Abstract Factory class that will return the subclass based on the input factory
// class. At first, it seems confusing but once you see the implementation, it’s really easy
// to grasp and understand the minor difference between Factory and Abstract Factory pattern.
// Like our factory pattern post, we will use the same superclass and subclasses.
public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();


    @Override
    public String toString() {
        return "RAM =" +this.getRAM()+ "HDD = "+this.getHDD()+"CPU ="+this.getCPU();
    }
}
