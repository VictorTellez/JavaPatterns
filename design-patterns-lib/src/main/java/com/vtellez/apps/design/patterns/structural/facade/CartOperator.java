package com.vtellez.apps.design.patterns.structural.facade;

/**
 * This class represents the worker who is in charge of provide the material to the other workers.
 *
 * Created by PC_02 on 02/12/2015.
 */
public class CartOperator extends BuildingTradeWorker {

    /**
     * Gets the name.
     *
     * @return  name
     */
    public String name() {
        return "Cart operator";
    }

    /**
     * Works.
     */
    public void work() {
        System.out.print(name() + " moves and provide the build material.");
    }

}
