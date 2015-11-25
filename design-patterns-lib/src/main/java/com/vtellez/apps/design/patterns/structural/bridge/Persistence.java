package com.vtellez.apps.design.patterns.structural.bridge;

/**
 * This interface represents the persistence memory storage.
 *
 * Created by PC_02 on 25/11/2015.
 */
public interface Persistence {

    /**
     * Gets the objectId in the persistence memory.
     *
     * @param object    to get the id
     * @return          object id
     */
    String persist(Object object);

    /**
     * Finds a object by its id.
     *
     * @param objectId  id of the object
     * @return          Object
     */
    Object findById(String objectId);

    /**
     * Deletes a object using its object id.
     *
     * @param objectId  id
     */
    void deleteById(String objectId);
}
