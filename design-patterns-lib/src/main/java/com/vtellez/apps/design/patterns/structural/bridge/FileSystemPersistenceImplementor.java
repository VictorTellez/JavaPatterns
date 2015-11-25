package com.vtellez.apps.design.patterns.structural.bridge;

import java.io.File;

/**
 * This class is the implementor concrete class to use the file system persistence.
 *
 * Created by PC_02 on 25/11/2015.
 */
public class FileSystemPersistenceImplementor implements PersistenceImplementor {

    /**
     * Deletes a object using its object id.
     *
     * @param objectId  id
     */
    @Override
    public void deleteObject(long objectId) {

        File f = new File("/persistence/"+Long.toString(objectId));
        f.delete();

        return;
    }

    /**
     * Gets the object using its object id.
     *
     * @param objectId  id
     * @return          object
     */
    @Override
    public Object getObject(long objectId) {
        File f = new File("/persistence/"+Long.toString(objectId));
        return readObjectFromFile(f);
    }

    /**
     * Reads object from a given file.
     *
     * @param f     file
     * @return      object
     */
    private Object readObjectFromFile(File f) {
        //TODO: open file, load object and return the object
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

        long fileId = System.currentTimeMillis();
        File file = new File("/persistence/" + Long.valueOf(fileId));

        writeObjectToFile(file, object);


        return fileId;
    }

    /**
     * Writes the object to the file.
     *
     * @param f         file to write
     * @param object    object to be saved
     */
    private void writeObjectToFile(File f, Object object) {
        //TODO: Serialize object and write to the file
    }
}
