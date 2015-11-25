package com.vtellez.apps.design.patterns.structural.decorator;

/**
 * This class is the decorator window.
 * Created by Victor Tellez on 25/11/2015.
 */
public class DecoratorWindow implements Window {
    /**
     * Window to be decorated.
     */
    private Window decorateWindow;

    /**
     * Constructor.
     *
     * @param decorateWindow    to be decorated
     */
    public DecoratorWindow(Window decorateWindow) {
        this.decorateWindow = decorateWindow;
    }

    /**
     * Renders a window.
     */
    @Override
    public void renderWindow() {
        System.out.println("Render a decorated window.");
        decorateWindow.renderWindow();
    }
}
