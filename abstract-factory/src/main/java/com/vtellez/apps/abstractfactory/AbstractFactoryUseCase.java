package com.vtellez.apps.abstractfactory;

import com.vtellez.apps.abstractfactory.material.MaterialFactory;
import com.vtellez.apps.abstractfactory.product.Cap;
import com.vtellez.apps.abstractfactory.product.Jacket;
import com.vtellez.apps.abstractfactory.product.Tshirt;

/**
 * This is an example of use.
 *
 * Created by Victor Tellez on 18/11/2015.
 */
public class AbstractFactoryUseCase {

    private SportFabricFactory sportFabricFactory;
    private WorkFabricFactory workFabricFactory;

    private Cap cap;
    private Jacket jacket;
    private Tshirt tshirt;


    public SportFabricFactory getAbstractSportFactoryUseCase() {
        sportFabricFactory = new SportFabricFactory();
        sportFabricFactory.madeCap(MaterialFactory.getMaterial(MaterialFactory.MaterialType.LYCRA));
        sportFabricFactory.madeTshirt(MaterialFactory.getMaterial(MaterialFactory.MaterialType.LYCRA));
        sportFabricFactory.madeJacket(MaterialFactory.getMaterial(MaterialFactory.MaterialType.LYCRA));

        return sportFabricFactory;
    }

    public WorkFabricFactory getAbstractWorkFactoryUseCase() {
        workFabricFactory = new WorkFabricFactory();
        workFabricFactory.madeCap(MaterialFactory.getMaterial(MaterialFactory.MaterialType.DENIM));
        workFabricFactory.madeTshirt(MaterialFactory.getMaterial(MaterialFactory.MaterialType.DENIM));
        workFabricFactory.madeJacket(MaterialFactory.getMaterial(MaterialFactory.MaterialType.DENIM));

        return workFabricFactory;
    }


    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Cap getCap() {
        return cap;
    }

    public void setCap(Cap cap) {
        this.cap = cap;
    }

    public Tshirt getTshirt() {
        return tshirt;
    }

    public void setTshirt(Tshirt tshirt) {
        this.tshirt = tshirt;
    }


}
