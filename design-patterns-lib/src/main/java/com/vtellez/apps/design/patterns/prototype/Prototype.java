package com.vtellez.apps.design.patterns.prototype;

/**
 * This is the class which implements Cloneable to allow the concrete classes to clone.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public abstract class Prototype implements Cloneable {
    /**
     * Clones a object.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public abstract Object clone() throws CloneNotSupportedException;
}
