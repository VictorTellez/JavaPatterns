package com.vtellez.apps.design.patterns.structural.bridge;

/**
 * Manages the persistence implementor depending of the concrete implementors
 * {@link FileSystemPersistenceImplementor} and {@link DatabasePersistenceImplementor}
 *
 * Created by Victor Tellez on 25/11/2015.
 */
public class PersistenceDriverUseCase {

    public static void managePersistenceImplementor() {

        PersistenceImplementor persistenceImplementor;

        if(databaseDriverExists()) {
            persistenceImplementor = new DatabasePersistenceImplementor();
        } else {
            persistenceImplementor = new FileSystemPersistenceImplementor();
        }

        Persistence persistence = new PersistenceImpl(persistenceImplementor);

        Object object = persistence.findById("122334444");

        if(object != null)
            object.toString();

        persistence.persist(object);

    }

    private static boolean databaseDriverExists() {

        return false;
    }
}
