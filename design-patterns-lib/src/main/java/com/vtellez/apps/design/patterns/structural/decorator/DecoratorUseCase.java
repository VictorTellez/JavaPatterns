package com.vtellez.apps.design.patterns.structural.decorator;

/**
 * This class is the use case of the Decorator pattern.
 *
 * Created by Victor Tellez on 25/11/2015.
 */
public class DecoratorUseCase {

    public static void useDecorator() {
        Window window = new BasicWindow();
        window.renderWindow();

        window = new ScrollableWindow(window);
        window.renderWindow();
    }
}
