package ocp.good;

public class DatabasePersistence implements InvoicePersistent {
    @Override
    public void save(Invoice invoice) {
        System.out.println("Data saved in the database using ID: "+invoice.hashCode());
    }
}
