package ocp.good;


public class TestOCPApp {

    public static void main(String[] args) {

        Book book = new Book("Network Analysis","Dennis","ISBN-12",1987,2500);
        Invoice invoice=new Invoice(book,4,45,6.71);
        DatabasePersistence databasePersistence= new DatabasePersistence();
        FilePersistence filePersistence= new FilePersistence();
        PersistenceManager persistenceManager= new PersistenceManager(databasePersistence,filePersistence);
        persistenceManager.info(databasePersistence,filePersistence);
        databasePersistence.save(invoice);
        filePersistence.save(invoice);



    }
}
