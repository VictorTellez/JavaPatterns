package com.vtellez.apps.abstractfactory;

import com.vtellez.apps.abstractfactory.material.Material;
import com.vtellez.apps.abstractfactory.material.MaterialFactory;
import com.vtellez.apps.abstractfactory.product.Cap;
import com.vtellez.apps.abstractfactory.product.Jacket;
import com.vtellez.apps.abstractfactory.product.Tshirt;

/**
 * This the class to made the product with a specific material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public interface FabricFactory {

    Cap madeCap(Material materialType);

    Jacket madeJacket(Material materialType);

    Tshirt madeTshirt(Material materialType);
}
