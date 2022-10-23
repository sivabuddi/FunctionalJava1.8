package ocp.good;

public class FilePersistence implements InvoicePersistent {
    @Override
    public void save(Invoice invoice) {
        System.out.println("Data saved in the File using ID: "+invoice.hashCode());
    }
}
