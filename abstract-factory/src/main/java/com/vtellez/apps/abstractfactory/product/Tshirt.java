package com.vtellez.apps.abstractfactory.product;

import com.vtellez.apps.abstractfactory.material.Material;
import com.vtellez.apps.abstractfactory.material.MaterialFactory;

/**
 * This class represents the product t-shirt to be made using a material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public interface Tshirt {
    /**
     * Makes a t-shirt.
     */
    public void made(Material material);
}
