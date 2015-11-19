package com.vtellez.apps.abstractfactory.material;

/**
 * This class represents the Leather material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class Leather implements Material {

    /**
     * Gets the material.
     */
    @Override
    public void getMaterial() {
        System.out.println("Get Leather material.");
    }
}
