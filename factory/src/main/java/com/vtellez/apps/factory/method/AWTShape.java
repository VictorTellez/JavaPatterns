package com.vtellez.apps.factory.method;

/**
 * This class represents the AWT shape.
 *
 * Created by Victor Tellez on 10/11/2015.
 */
public class AWTShape implements Shape {

    /**
     * The type of the border.
     */
    private BorderType borderType;

    /**
     * Constructor.
     *
     * @param borderType    the type of the border
     */
    public AWTShape(BorderType borderType) {
        this.borderType = borderType;
    }

    @Override
    public String toString() {
        return "AWTShape " + borderType;
    }
}
