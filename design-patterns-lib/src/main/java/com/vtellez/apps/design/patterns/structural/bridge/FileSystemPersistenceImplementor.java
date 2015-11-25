package com.vtellez.apps.design.patterns.structural.bridge;

/**
 * Created by PC_02 on 25/11/2015.
 */
public class FileSystemPersistenceImplementor implements PersistenceImplementor {
    @Override
    public long saveObject(Object object) {
        return 0;
    }

    @Override
    public void deleteObject(long objectId) {

    }

    @Override
    public Object getObject(long objectId) {
        return null;
    }
}
