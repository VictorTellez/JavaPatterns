package com.vtellez.apps.abstractfactory.product;

import com.vtellez.apps.abstractfactory.material.Material;
import com.vtellez.apps.abstractfactory.material.MaterialFactory;

/**
 * This class represents the product work t-shirt to be made using a material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class WorkTshirt implements Tshirt {
    /**
     * Makes a work t-shirt.
     */
    @Override
    public void made(Material material) {
        System.out.println("Make a work t-shirt with the material " + material);
    }
}
