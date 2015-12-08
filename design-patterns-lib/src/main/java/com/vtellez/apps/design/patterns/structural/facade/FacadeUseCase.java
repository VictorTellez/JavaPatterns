package com.vtellez.apps.design.patterns.structural.facade;

/**
 * Facade pattern hides the complexities of the system and provides an interface to the client using which
 * the client can access the system. This type of design pattern comes under structural pattern as this pattern
 * adds an interface to existing system to hide its complexities.
 *
 * Created by PC_02 on 02/12/2015.
 */
public class FacadeUseCase {

    /**
     * Using the pattern.
     */
    public static void useFacade() {
        BuildingFacade facade = new BuildingFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
