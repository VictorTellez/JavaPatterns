package com.vtellez.apps.design.patterns.structural.composite;

/**
 * This class represents a basic view component.
 *
 * Created by Victor Tellez on 24/11/2015.
 */
public class BasicView extends CompositeView {

    /**
     * Constructor.
     */
    public BasicView() {
        super();
    }

    /**
     * Draws the view.
     */
    @Override
    protected void onDraw() {
        System.out.println("Draw Basic View.");
    }
}
