package structuraldesingpattern.adapter.designpattern;
// object level adapter
public class PenAdapter implements Pen{
    PilotPen pp  = new PilotPen(); // composition
    @Override
    public void write(String str) {
        pp.mark(str);

    }
}
