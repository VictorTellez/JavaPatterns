package com.vtellez.apps.factory.method;

/**
 * This class creates a Swing shape.
 *
 * Created by Victor Tellez on 10/11/2015.
 */
public class SwingGraphics implements Graphics {

    /**
     * Constructor.
     *
     * @param borderType     type of the shape
     * @return              a swing shape
     */
    @Override
    public Shape createShape(BorderType borderType) {
        return new SwingShape(borderType);
    }
}
