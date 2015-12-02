package com.vtellez.apps.design.patterns.structural.facade;

/**
 * This class represents the worker who builds walls, houses, and other structures with bricks.
 *
 * Created by PC_02 on 02/12/2015.
 */
public class BrickLayer extends BuildingTradeWorker {

    /**
     * Gets the name.
     *
     * @return  name
     */
    public String name() {
        return "Brick layer";
    }

    /**
     * Works.
     */
    public void work() {
        System.out.print(name() + " builds walls, houses, and other structures with bricks.");
    }

}
