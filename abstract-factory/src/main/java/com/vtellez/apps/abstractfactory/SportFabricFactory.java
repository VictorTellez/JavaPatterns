package com.vtellez.apps.abstractfactory;

import com.vtellez.apps.abstractfactory.material.Material;
import com.vtellez.apps.abstractfactory.product.Cap;
import com.vtellez.apps.abstractfactory.product.SportCap;
import com.vtellez.apps.abstractfactory.product.Jacket;
import com.vtellez.apps.abstractfactory.product.SportJacket;
import com.vtellez.apps.abstractfactory.product.SportTshirt;
import com.vtellez.apps.abstractfactory.product.Tshirt;

/**
 * This the class to made the product with a specific material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class SportFabricFactory implements FabricFactory {


    @Override
    public Cap madeCap(Material material) {
        SportCap sportCap = new SportCap();
        sportCap.made(material);

        return sportCap;
    }

    @Override
    public Jacket madeJacket(Material materialType) {
        SportJacket sportJacket =  new SportJacket();
        sportJacket.made(materialType);

        return sportJacket;
    }

    @Override
    public Tshirt madeTshirt(Material material) {
        SportTshirt sportTshirt = new SportTshirt();
        sportTshirt.made(material);

        return sportTshirt;
    }
}
