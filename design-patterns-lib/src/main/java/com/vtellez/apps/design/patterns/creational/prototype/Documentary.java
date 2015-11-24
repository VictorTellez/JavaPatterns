package com.vtellez.apps.design.patterns.prototype;

/**
 * This class represent a generic documentary.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public abstract class Documentary extends Prototype {
    /**
     * Clones a documentary.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public abstract Documentary clone() throws CloneNotSupportedException;
}
