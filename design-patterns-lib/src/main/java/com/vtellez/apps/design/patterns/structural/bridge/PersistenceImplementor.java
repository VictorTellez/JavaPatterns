package com.vtellez.apps.design.patterns.structural.bridge;

/**
 * This interface contains the methods to manage the Objects in memory.
 *
 * Created by PC_02 on 25/11/2015.
 */
public interface PersistenceImplementor {

    /**
     * Deletes a object using its object id.
     *
     * @param objectId  id
     */
    public void deleteObject(long objectId);

    /**
     * Gets the object using its object id.
     *
     * @param objectId  id
     * @return          Object
     */
    public Object getObject(long objectId);

    /**
     * Saves a object.
     *
     * @param object    to be saved
     * @return          the id of the object in the memory
     */
    public long saveObject(Object object);
}
