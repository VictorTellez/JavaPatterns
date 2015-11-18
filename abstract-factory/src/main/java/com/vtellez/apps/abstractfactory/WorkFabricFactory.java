package com.vtellez.apps.abstractfactory;

import com.vtellez.apps.abstractfactory.material.Material;
import com.vtellez.apps.abstractfactory.product.Cap;
import com.vtellez.apps.abstractfactory.product.Jacket;
import com.vtellez.apps.abstractfactory.product.Tshirt;
import com.vtellez.apps.abstractfactory.product.WorkCap;
import com.vtellez.apps.abstractfactory.product.WorkJacket;
import com.vtellez.apps.abstractfactory.product.WorkTshirt;

/**
 * This the class to made the product with a specific material.
 *
 * Created by Victor Tellez on 13/11/2015.
 */
public class WorkFabricFactory implements FabricFactory {

    @Override
    public Cap madeCap(Material materialType) {
        WorkCap workCap = new WorkCap();
        workCap.made(materialType);

        return workCap;
    }

    @Override
    public Jacket madeJacket(Material materialType) {
        WorkJacket workJacket = new WorkJacket();
        workJacket.made(materialType);

        return workJacket;
    }

    @Override
    public Tshirt madeTshirt(Material materialType) {
        WorkTshirt workTshirt = new WorkTshirt();
        workTshirt.made(materialType);

        return workTshirt;
    }
}
