package com.vtellez.apps.design.patterns.factory.method;

/**
 * Border type enumeration.
 *
 * Created by Victor Tellez on 10/11/2015.
 */
public enum BorderType {

    SOLID("solid border"),
    DOTTED("dotted border"),
    NONE("none");

    /**
     * Type of the border.
     */
    private String mType;

    /**
     * Constructor.
     *
     * @param type  of the border
     */
    BorderType(String type) {
        this.mType = type;
    }

    @Override
    public String toString() {
        return mType;
    }

}
