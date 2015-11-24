package com.vtellez.apps.design.patterns.structural.composite;

/**
 * This class represents a Content view.
 *
 * Created by Victor Tellez on 24/11/2015.
 */
public class ContentView extends CompositeView {

    /**
     * Constructor.
     */
    public ContentView() {
        super();
    }

    /**
     * Draws the content view.
     */
    @Override
    protected void onDraw() {
        System.out.println("Draw Content View.");
    }
}
