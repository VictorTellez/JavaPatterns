package com.vtellez.apps.abstractfactory.product;

import com.vtellez.apps.abstractfactory.material.Material;
import com.vtellez.apps.abstractfactory.material.MaterialFactory;

/**
 * This class represents the product sport jacket to be made using a material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class SportJacket implements Jacket {
    /**
     * Makes a sport jacket.
     */
    @Override
    public void made(Material material) {
        System.out.println("Make a sport jacket with the material " + material);
    }
}
