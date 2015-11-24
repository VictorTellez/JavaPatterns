package com.vtellez.apps.design.patterns.prototype;

/**
 * This class represents the drama series.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public class DramaSeries extends Series {

    /**
     * Tag to print.
     */
    public static final String DRAMA_SERIES = "Drama series";

    /**
     * Constructor.
     */
    public DramaSeries(){}

    /**
     * Constructor.
     *
     * @param series
     */
    public DramaSeries(DramaSeries series){}

    /**
     * Clones a drama series.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public DramaSeries clone() throws CloneNotSupportedException {
        return new DramaSeries();
    }

    @Override
    public String toString() {
        return DRAMA_SERIES;
    }
}
