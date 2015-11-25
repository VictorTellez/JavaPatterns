package com.vtellez.apps.design.patterns.structural.bridge;

import org.junit.Test;

/**
 * Manages the persistence implementor depending of the concrete implementors
 * {@link FileSystemPersistenceImplementor} and {@link DatabasePersistenceImplementor}
 *
 * Created by Victor Tellez on 25/11/2015.
 */
public class PersistenceDriverUseCaseTest {
    @Test
    public void test() {
        PersistenceDriverUseCase.managePersistenceImplementor();
    }

}
