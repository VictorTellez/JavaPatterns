package com.vtellez.apps.design.patterns.structural.decorator;

/**
 * This interface represents a generic window.
 *
 * Created by Victor Tellez on 25/11/2015.
 */
public class BasicWindow implements Window {
    /**
     * Renders a window.
     */
    public void renderWindow() {
        System.out.println("Render a basic window.");
    }
}
