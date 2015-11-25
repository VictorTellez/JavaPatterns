package com.vtellez.apps.design.patterns.structural.bridge;

/**
 * Abstraction Imp
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
     *
     * @param objectId  id of the object
     * @return
     */
    @Override
    public Object findById(String objectId) {
        return persistenceImplementor.getObject(Long.valueOf(objectId));
    }

    @Override
    public void deleteById(String objectId) {
        persistenceImplementor.deleteObject(Long.valueOf(objectId));
    }
}
