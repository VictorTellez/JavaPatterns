package com.vtellez.apps.design.patterns.prototype;

/**
 * This class represents the drama documentary.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public class DramaDocumentary extends Documentary {

    /**
     * Tag to print.
     */
    public static final String DRAMA_DOCUMENTARY = "Drama documentary";

    /**
     * Constructor.
     */
    public DramaDocumentary(){}

    /**
     * Constructor.
     *
     * @param comedyDocumentary
     */
    public DramaDocumentary(DramaDocumentary comedyDocumentary){}

    /**
     * Clones a drama documentary.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public Documentary clone() throws CloneNotSupportedException {
        return new DramaDocumentary();
    }

    @Override
    public String toString() {
        return DRAMA_DOCUMENTARY;
    }
}
