package com.vtellez.apps.design.patterns.structural.decorator;

/**
 * This class is the decorator window.
 * Created by Victor Tellez on 25/11/2015.
 */
public class ScrollableWindow extends DecoratorWindow {
    /**
     * Window to be decorated.
     */
    private Window scrollableWindow;

    /**
     * Constructor.
     *
     * @param decorateWindow    to be decorated
     */
    public ScrollableWindow(Window decorateWindow) {
        super(decorateWindow);
        scrollableWindow = decorateWindow;
    }

    /**
     * Renders a window.
     */
    @Override
    public void renderWindow() {
        renderScrollable();
        System.out.println("Render a scrollable window.");
        super.renderWindow();
    }

    /**
     * Scrolls a window.
     */
    private void renderScrollable() {
        System.out.println("Render a scroll.");
    }

}
