package com.vtellez.apps.abstractfactory.product;

import com.vtellez.apps.abstractfactory.material.Material;
import com.vtellez.apps.abstractfactory.material.MaterialFactory;

/**
 * This class represents the product sport t-shirt to be made using a material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class SportTshirt implements Tshirt {
    /**
     * Makes a sport t-shirt.
     */
    @Override
    public void made(Material material) {
        System.out.println("Make a sport t-shirt with the material " + material);
    }
}
