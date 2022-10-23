package srp.good;

public class InvoicePersistent {

    Invoice invoice;

    public InvoicePersistent(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        System.out.println("Saved file in Hard Disk with name is "+filename);
    }


}
