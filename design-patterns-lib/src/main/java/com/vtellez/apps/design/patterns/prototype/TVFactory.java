package com.vtellez.apps.design.patterns.prototype;

/**
 * This interface represents the factory to get the general TV contents.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public interface TVFactory {
    /**
     * Creates a documentary.
     *
     * @return  Documentary
     */
    Documentary createDocumentary();

    /**
     * Creates a Movie.
     *
     * @return  Movie
     */
    Movie createMovie();

    /**
     * Creates a Series.
     *
     * @return  Series
     */
    Series createSeries();
}
