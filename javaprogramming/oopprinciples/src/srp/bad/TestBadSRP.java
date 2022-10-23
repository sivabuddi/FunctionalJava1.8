package srp.bad;

public class TestBadSRP {

    public static void main(String[] args) {
        Book book = new Book("Network Analysis","Dennis","ISBN-12",1987,2500);
        Invoice invoice=new Invoice(book,2,40,9.1);
        invoice.printInvoice();
        invoice.saveToFile("TestingFile");

    }
}
