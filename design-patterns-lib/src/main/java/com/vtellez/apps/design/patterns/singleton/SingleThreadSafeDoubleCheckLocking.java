package com.vtellez.apps.design.patterns.singleton;

/**
 * Double check locking
 * <p/>
 * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 * <p/>
 * Broken under Java 1.4.
 *
 * @author mortezaadi@gmail.com
 */
public class SingleThreadSafeDoubleCheckLocking {

    private static volatile SingleThreadSafeDoubleCheckLocking INSTANCE;

    /**
     * private constructor to prevent client from instantiating.
     */
    private SingleThreadSafeDoubleCheckLocking() {
        // to prevent instantiating by Reflection call
        if (INSTANCE != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * Public accessor.
     *
     * @return an instance of the class.
     */
    public static SingleThreadSafeDoubleCheckLocking getInstance() {
        // local variable increases performance by 25 percent
        // Joshua Bloch "Effective Java, Second Edition", p. 283-284
        SingleThreadSafeDoubleCheckLocking result = INSTANCE;
        if (result == null) {
            synchronized (SingleThreadSafeDoubleCheckLocking.class) {
                result = INSTANCE;
                if (result == null) {
                    INSTANCE = result = new SingleThreadSafeDoubleCheckLocking();
                }
            }
        }
        return result;
    }
}