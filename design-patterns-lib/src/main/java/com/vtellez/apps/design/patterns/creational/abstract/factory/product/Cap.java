package com.vtellez.apps.abstractfactory.product;

import com.vtellez.apps.abstractfactory.material.Material;

/**
 * This class represents the product cap to be made using a material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public interface Cap {
    /**
     * Makes a cap.
     */
    public void made(Material material);
}
