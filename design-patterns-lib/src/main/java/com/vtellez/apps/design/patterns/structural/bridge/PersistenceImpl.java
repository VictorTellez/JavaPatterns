package com.vtellez.apps.design.patterns.structural.bridge;

/**
 * This class is the implementation of the {@link Persistence} and allows as to separate the
 * declaration or abstraction from the implementation.
 *
 * Created by PC_02 on 25/11/2015.
 */
public class PersistenceImpl  implements Persistence {

    /**
     * The persistence implementor.
     */
    PersistenceImplementor persistenceImplementor;

    /**
     * Constructor.
     *
     * @param persistenceImplementor    to manage the object in memory
     */
    public PersistenceImpl(PersistenceImplementor persistenceImplementor) {
        this.persistenceImplementor = persistenceImplementor;
    }

    /**
     * Saves the object getting its id in the memory.
     *
     * @param object    to get the id
     * @return          id
     */
    @Override
    public String persist(Object object) {
        return  Long.toString(persistenceImplementor.saveObject(object));
    }

    /**
     * Finds a object by Id.
     *
     * @param objectId  id of the object
     * @return          object
     */
    @Override
    public Object findById(String objectId) {
        return persistenceImplementor.getObject(Long.valueOf(objectId));
    }

    /**
     * Deletes a object using the id.
     *
     * @param objectId  id
     */
    @Override
    public void deleteById(String objectId) {
        persistenceImplementor.deleteObject(Long.valueOf(objectId));
    }
}
