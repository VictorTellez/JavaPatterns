package com.vtellez.apps.abstractfactory.product;

import com.vtellez.apps.abstractfactory.material.Material;

/**
 * This class represents the product Jacket to be made using a material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public interface Jacket {
    /**
     * Makes a jacket.
     */
    public void made(Material material);
}
