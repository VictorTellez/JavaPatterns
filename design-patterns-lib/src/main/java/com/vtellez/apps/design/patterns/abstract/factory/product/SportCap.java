package com.vtellez.apps.abstractfactory.product;

import com.vtellez.apps.abstractfactory.material.Material;

/**
 * This class represents the product sport cap to be made using a material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class SportCap implements Cap {
    /**
     * Makes a sport cap.
     */
    @Override
    public void made(Material material) {
        System.out.println("Make a sport cap with the material " + material);
    }
}
