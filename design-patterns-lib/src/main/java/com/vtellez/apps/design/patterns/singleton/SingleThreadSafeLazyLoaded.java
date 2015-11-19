package com.vtellez.apps.design.patterns.singleton;

/**
 * Created by Victor Tellez on 19/11/2015.
 */
/**
 * Thread-safe Singleton class. The instance is lazily initialized and thus needs synchronization
 * mechanism.
 *
 * Note: if created by reflection then a singleton will not be created but multiple options in the
 * same classloader
 */
public class SingleThreadSafeLazyLoaded {

    private static SingleThreadSafeLazyLoaded instance = null;

    private SingleThreadSafeLazyLoaded() {}

    /**
     * The instance gets created only when it is called for first time. Lazy-loading
     */
    public synchronized static SingleThreadSafeLazyLoaded getInstance() {

        if (instance == null) {
            instance = new SingleThreadSafeLazyLoaded();
        }

        return instance;
    }
}
