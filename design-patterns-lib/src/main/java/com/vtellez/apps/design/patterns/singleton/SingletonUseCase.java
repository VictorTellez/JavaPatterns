package com.vtellez.apps.design.patterns.singleton;

/**
 * This is a generic use case of the Singleton design pattern.
 *
 * Created by Victor Tellez on 19/11/2015.
 */
public class SingletonUseCase {

    public static void useSingleton() {

        useSimpleSingleton();
        useSingleInitOnDemand();
        useSingleThreadSafeLazyLoaded();
        useSingleThreadSafeDoubleCheckLocking();
    }

    /**
     * Uses singleton
     */
    private static void useSimpleSingleton() {
        // eagerly initialized singleton
        SingleSimple singleSimple1 = SingleSimple.getInstance();
        SingleSimple singleSimple2 = SingleSimple.getInstance();
        System.out.println("SingleSimple1 = " + singleSimple1);
        System.out.println("SingleSimple2 = " + singleSimple2);
    }

    private static void useSingleInitOnDemand() {
        // initialize on demand holder idiom
        SingleInitOnDemandHolder demandHolderIdiom1 = SingleInitOnDemandHolder.getInstance();
        System.out.println("demandHolderIdiom1" + demandHolderIdiom1);
        SingleInitOnDemandHolder demandHolderIdiom2 = SingleInitOnDemandHolder.getInstance();
        System.out.println("demandHolderIdiom2" + demandHolderIdiom2);
    }

    private static void useSingleThreadSafeLazyLoaded() {
        // lazily initialized singleton
        SingleThreadSafeLazyLoaded dcl1 = SingleThreadSafeLazyLoaded.getInstance();
        System.out.println("SingleThreadSafeLazyLoaded1" + dcl1);
        SingleThreadSafeLazyLoaded dcl2 = SingleThreadSafeLazyLoaded.getInstance();
        System.out.println("SingleThreadSafeLazyLoaded2" +dcl2);
    }

    private static void useSingleThreadSafeDoubleCheckLocking() {
        // double checked locking
        SingleThreadSafeDoubleCheckLocking singleThreadSafeDoubleCheckLocking1 =
                SingleThreadSafeDoubleCheckLocking.getInstance();
        SingleThreadSafeDoubleCheckLocking singleThreadSafeDoubleCheckLocking2 =
                SingleThreadSafeDoubleCheckLocking.getInstance();
        System.out.println("SingleThreadSafeDoubleCheckLocking1=" + singleThreadSafeDoubleCheckLocking1);
        System.out.println("SingleThreadSafeDoubleCheckLocking2=" + singleThreadSafeDoubleCheckLocking2);
    }
}
