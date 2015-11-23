package com.vtellez.apps.design.patterns.singleton;

import java.io.Serializable;

/**
 * The Initialize-on-demand-holder idiom is a secure way of creating lazy initialized singleton
 * object in Java. refer to "The CERT Oracle Secure Coding Standard for Java" By Dhruv Mohindra,
 * Robert C. Seacord p.378
 * <p/>
 * Singleton objects usually are heavy to create and sometimes need to serialize them. This class
 * also shows how to preserve singleton in serialized version of singleton.
 *
 * @author mortezaadi@gmail.com
 */
public class SingleInitOnDemandHolder implements Serializable {

    private static final long serialVersionUID = 1L;

    private SingleInitOnDemandHolder() {}

    public static SingleInitOnDemandHolder getInstance() {
        return HelperHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    private static class HelperHolder {
        public static final SingleInitOnDemandHolder INSTANCE =  new SingleInitOnDemandHolder();
    }
}
