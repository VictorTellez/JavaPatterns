package com.vtellez.apps.design.patterns.prototype;

/**
 * This class represents a generic series.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public abstract class Series extends Prototype {
    /**
     * Clones a series.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public abstract Series clone() throws CloneNotSupportedException;
}
