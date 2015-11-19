package com.vtellez.apps.design.patterns.factory.method;

/**
 * This interface is used to create shapes {@link Shape}.
 *
 * Created by Victor Tellez on 10/11/2015.
 */
public interface Graphics {

    /**
     * Creates a shape with the type of border.
     *
     * @param borderType    the type of the border
     * @return              the shape
     */
    Shape createShape(BorderType borderType);
}
