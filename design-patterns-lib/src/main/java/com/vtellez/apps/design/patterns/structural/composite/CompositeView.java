package com.vtellez.apps.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class which compound the views.
 *
 * Created by Victor Tellez on 24/11/2015.
 */
public abstract class CompositeView {

    /**
     * List of children.
     */
    private List<CompositeView> children = new ArrayList<>();

    /**
     * Constructor. Calls onDraw().
     */
    public CompositeView(){
        onDraw();
    }

    /**
     * Adds the views to the children.
     *
     * @param compositeView     the view to compound
     */
    public void add(CompositeView compositeView) {
        children.add(compositeView);
    }

    /**
     * Counts the children.
     *
     * @return  number of children
     */
    public int count() {
        return children.size() + 1;
    }

    /**
     * Draws the children.
     */
    protected void onDraw() {
        if (children.size() > 0) {

            for (CompositeView compositeView : children) {
                compositeView.onDraw();
            }
        }
    }
}
