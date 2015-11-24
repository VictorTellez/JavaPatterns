package com.vtellez.apps.design.patterns.factory.method;

/**
 * This class represents the Swint shape.
 *
 * Created by Victor Tellez on 10/11/2015.
 */
public class SwingShape implements Shape {

    /**
     * The type of the border
     */
    private BorderType borderType;

    /**
     * Constructor.
     *
     * @param borderType    the type of the shape
     */
    public SwingShape(BorderType borderType) {
        this.borderType = borderType;
    }

    @Override
    public String toString() {
        return "SwingShape " + borderType;
    }
}
