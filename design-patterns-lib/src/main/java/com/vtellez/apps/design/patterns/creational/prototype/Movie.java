package com.vtellez.apps.design.patterns.prototype;

/**
 * This class represents a generic movie.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public abstract class Movie extends Prototype {
    /**
     * Clones a movie.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public abstract Movie clone() throws CloneNotSupportedException;
}
