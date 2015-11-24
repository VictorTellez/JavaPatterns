package com.vtellez.apps.design.patterns.structural.composite;


/**
 * This class manage the compound a list of views using the {@link CompositeView}.
 * <p/>
 * Created by Victor Tellez on 24/11/2015.
 */
public class UIManager {

    /**
     * Example of composition.
     *
     * @return  The views to compound
     */
    public static CompositeView composition() {

        ContentView contentView = new ContentView();
        contentView.add(new BasicView());
        contentView.add(new TextView());

        return contentView;
    }

}
