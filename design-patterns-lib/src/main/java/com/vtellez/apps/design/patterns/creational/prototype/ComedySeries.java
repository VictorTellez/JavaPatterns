package com.vtellez.apps.design.patterns.prototype;

/**
 * This class represents the Comedy series.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public class ComedySeries extends Series {

    /**
     * Tag to print.
     */
    public static final String COMEDY_SERIES = "Comedy series";

    /**
     * Constructor.
     */
    public ComedySeries(){}

    /**
     * Constructor.
     *
     * @param series
     */
    public ComedySeries(ComedySeries series){}

    /**
     * Clones the comedy series.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public ComedySeries clone() throws CloneNotSupportedException {
        return new ComedySeries();
    }

    @Override
    public String toString() {
        return COMEDY_SERIES;
    }
}
