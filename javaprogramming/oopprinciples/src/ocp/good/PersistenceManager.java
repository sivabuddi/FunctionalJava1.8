package ocp.good;

import java.io.File;

public class PersistenceManager {

    DatabasePersistence databasePersistence;
    FilePersistence filePersistence;

    public PersistenceManager(DatabasePersistence databasePersistence, FilePersistence filePersistence) {
        this.databasePersistence = databasePersistence;
        this.filePersistence = filePersistence;
    }

    public void info(DatabasePersistence data, FilePersistence files){
        System.out.println("Info about data persistence inside info() ="+databasePersistence.hashCode());
        System.out.println("Info about data file persistence inside info()="+filePersistence.hashCode());
        System.out.println("Invoice Id data ="+data.hashCode());
        System.out.println("Invoice Id file ="+files.hashCode());
    }
}
