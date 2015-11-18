package com.vtellez.apps.abstractfactory.product;

import com.vtellez.apps.abstractfactory.material.Material;
import com.vtellez.apps.abstractfactory.material.MaterialFactory;

/**
 * This class represents the product work jacket to be made using a material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class WorkJacket implements Jacket {
    /**
     * Makes a work jacket.
     *
     * @param material  to made the product
     */
    @Override
    public void made(Material material) {
        System.out.println("Make a work jacket with the material " + material);
    }
}
