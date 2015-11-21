package com.vtellez.apps.design.patterns.prototype;

/**
 * This class is the implementation of the TV Factory. This class will provide the TV content.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public class TVFactoryImpl implements TVFactory {
    /**
     * Documentary.
     */
    private Documentary documentary;

    /**
     * Movie.
     */
    private Movie movie;

    /**
     * Series.
     */
    private Series series;

    public TVFactoryImpl(Documentary documentary, Movie movie, Series series) {
        this.documentary = documentary;
        this.movie = movie;
        this.series = series;
    }

    /**
     * Creates a documentary.
     *
     * @return  Documentary
     */
    @Override
    public Documentary createDocumentary() {
        try {
            return documentary.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Creates a Movie.
     *
     * @return  Movie
     */
    @Override
    public Movie createMovie() {
        try {
            return movie.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Creates a Series.
     *
     * @return  Series
     */
    @Override
    public Series createSeries() {
        try {
            return series.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
