package com.vtellez.apps.abstractfactory.product;

import com.vtellez.apps.abstractfactory.material.Material;
/**
 * This class represents the product work cap to be made using a material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class WorkCap implements Cap {
    /**
     * Makes a work cap.
     */
    @Override
    public void made(Material material) {
        System.out.println("Make a work cap with the material " + material);
    }
}
