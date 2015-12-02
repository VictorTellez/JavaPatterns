package com.vtellez.apps.design.patterns.structural.facade;

/**
 * This class represents the worker who cuts, prepares, and builds with stone.
 *
 * Created by PC_02 on 02/12/2015.
 */
public class StoneMason extends BuildingTradeWorker {

    /**
     * Gets the name.
     *
     * @return  name
     */
    public String name() {
        return "Stone mason";
    }

    /**
     * Works.
     */
    public void work() {
        System.out.print(name() + " cuts, prepares, and builds with stone.");
    }

}
