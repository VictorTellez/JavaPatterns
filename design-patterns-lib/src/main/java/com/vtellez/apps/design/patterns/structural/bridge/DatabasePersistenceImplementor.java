package com.vtellez.apps.design.patterns.structural.bridge;

/**
 * This class is the implementor concrete class to use the database persistence.
 * Created by Victor Tellez on 25/11/2015.
 */
public class DatabasePersistenceImplementor implements PersistenceImplementor {

    public DatabasePersistenceImplementor() {
        //TODO: load database driver
    }

    /**
     * Deletes a object using its object id.
     *
     * @param objectId  id
     */
    @Override
    public void deleteObject(long objectId) {

    }

    /**
     * Gets the object using its object id.
     *
     * @param objectId  id
     * @return          object
     */
    @Override
    public Object getObject(long objectId) {
        //TODO: open database connection, read records and create object from record
        return null;
    }

    /**
     * Saves a object.
     *
     * @param object    to be saved
     * @return          the id of the object in the memory
     */
    @Override
    public long saveObject(Object object) {
        //TODO: open database connection and create records for fields inside the object
        return 0;
    }
}
