package srp.good;


public class TestGoodSRP {

    public static void main(String[] args) {
        Book book = new Book("Network Analysis","Dennis","ISBN-12",1987,2500);
        Invoice invoice=new Invoice(book,4,45,6.71);
        InvoicePrinter invoicePrinter=new InvoicePrinter(invoice,book);
        invoicePrinter.printInvoice();
        InvoicePersistent invoicePersistent= new InvoicePersistent(invoice);
        invoicePersistent.saveToFile("Testing");

    }
}
