package com.vtellez.apps.design.patterns.singleton;

/**
 * This is a singleton class. Eagerly initialized static instance guarantees thread safety.
 *
 * Created by Victor Tellez on 19/11/2015.
 */
public class SingleSimple {

    /**
     * Static to the class and instance of the same class.
     */
    private static final SingleSimple instance = new SingleSimple();

    /**
     * Private constructor to avoid instances.
     */
    private SingleSimple() {
    }

    /**
     * Get the unique instance of the class.
     *
     * @return  singleton instance
     */
    public static SingleSimple getInstance(){
        return instance;
    }
}
