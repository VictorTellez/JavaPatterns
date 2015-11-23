package com.vtellez.apps.design.patterns.prototype;

/**
 * Use case of the Prototype pattern.
 *
 * Created by Victor Tellez on 21/11/2015.
 */
public class PrototypeUseCase {

    public static void usePrototypeUseCase() {
        TVFactory tvFactory;
        Documentary documentary;
        Movie movie;
        Series series;

        tvFactory = new TVFactoryImpl(new ComedyDocumentary(), new ComedyMovie(), new ComedySeries());
        documentary = tvFactory.createDocumentary();
        movie = tvFactory.createMovie();
        series = tvFactory.createSeries();
        System.out.println(documentary);
        System.out.println(movie);
        System.out.println(series);

        tvFactory = new TVFactoryImpl(new DramaDocumentary(), new DramaMovie(), new DramaSeries());
        documentary = tvFactory.createDocumentary();
        movie = tvFactory.createMovie();
        series = tvFactory.createSeries();
        System.out.println(documentary);
        System.out.println(movie);
        System.out.println(series);
    }

}
