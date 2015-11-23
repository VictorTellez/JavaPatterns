package com.vtellez.apps.design.patterns.factory.method;

/**
 * This class creates a shape with AWT.
 *
 * Created by Victor Tellez on 10/11/2015.
 */
public class AWTGraphics implements Graphics {

    /**
     * Constructor.
     *
     * @param borderType     the type of a shape
     * @return              a AWT shape
     */
    @Override
    public Shape createShape(BorderType borderType) {
        return new AWTShape(borderType);
    }
}
