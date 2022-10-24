package structuraldesingpattern.adapter.designpattern2;


public class ConverterMain {

    public static void main(String[] args) {

        Socket5 socket5 = new Socket5Concrete();
        socket5.convert5();

        Socket120 socket120= new Socket120Concrete();
        socket120.convert120();

        Socket120 converter= new SocketToMobileAdapter(new Socket5Concrete());
        converter.convert120();
    }

}
