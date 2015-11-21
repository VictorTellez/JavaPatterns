package com.vtellez.apps.design.patterns.prototype;

/**
 * This class represents the drama movie.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public class DramaMovie extends Movie {

    /**
     * Tag to print.
     */
    public static final String DRAMA_MOVIE = "Drama movie";

    /**
     * Constructor.
     */
    public DramaMovie(){}

    /**
     * Constructor.
     *
     * @param comedyMovie
     */
    public DramaMovie(DramaMovie comedyMovie){}

    /**
     * Clones a drama movie.
     *
     * @return                              cloned object
     * @throws CloneNotSupportedException   exception
     */
    @Override
    public Movie clone() throws CloneNotSupportedException {
        return new DramaMovie();
    }

    @Override
    public String toString() {
        return DRAMA_MOVIE;
    }
}
