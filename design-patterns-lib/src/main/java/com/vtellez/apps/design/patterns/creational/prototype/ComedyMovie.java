package com.vtellez.apps.design.patterns.prototype;

/**
 * This class represents the Comendy movie.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public class ComedyMovie extends Movie {

    /**
     * Tag to print.
     */
    public static final String COMEDY_MOVIE = "Comedy movie";

    /**
     * Constructor.
     */
    public ComedyMovie(){}

    /**
     * Constructor.
     */
    public ComedyMovie(ComedyMovie comedyMovie){}

    /**
     * Clones a comedy movie.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public Movie clone() throws CloneNotSupportedException {
        return new ComedyMovie();
    }

    @Override
    public String toString() {
        return COMEDY_MOVIE;
    }
}
