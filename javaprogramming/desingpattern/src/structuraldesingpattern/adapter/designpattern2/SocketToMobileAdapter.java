package structuraldesingpattern.adapter.designpattern2;

public class SocketToMobileAdapter implements Socket120 {

    Socket5 socket5; // object level composition, destination

    public SocketToMobileAdapter(Socket5 socket5) {
        this.socket5 = socket5;
    }

    @Override
    public void convert120() {
        socket5.convert5();

    }
}
