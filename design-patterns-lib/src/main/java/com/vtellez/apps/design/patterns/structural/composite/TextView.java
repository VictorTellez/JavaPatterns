package com.vtellez.apps.design.patterns.structural.composite;

/**
 * This class representes a textview.
 * <p/>
 * Created by Victor Tellez on 24/11/2015.
 */
public class TextView extends CompositeView {

    /**
     * Constructor.
     */
    public TextView() {
        super();
    }

    /**
     * Draws the view.
     */
    @Override
    protected void onDraw() {
        System.out.println("Draw Text View.");
    }
}
