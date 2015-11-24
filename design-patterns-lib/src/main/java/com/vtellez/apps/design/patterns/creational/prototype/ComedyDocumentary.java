package com.vtellez.apps.design.patterns.prototype;

/**
 * This class represents the Comedy documentary.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public class ComedyDocumentary extends Documentary {

    /**
     * Tag to print.
     */
    public static final String COMEDY_DOCUMENTARY = "Comedy documentary";

    /**
     * Constructor.
     */
    public ComedyDocumentary(){}

    /**
     * Constructor.
     */
    public ComedyDocumentary(ComedyDocumentary comedyDocumentary){}

    /**
     * Clones a comedy documentary.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public Documentary clone() throws CloneNotSupportedException {
        return new ComedyDocumentary();
    }

    @Override
    public String toString() {
        return COMEDY_DOCUMENTARY;
    }
}
