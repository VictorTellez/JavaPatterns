package com.vtellez.apps.abstractfactory.material;

/**
 * This class represents the Lycra material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class Lycra implements Material {

    /**
     * Gets the material.
     */
    @Override
    public void getMaterial() {
        System.out.println("Get Lycra material.");
    }
}
