package com.vtellez.apps.design.patterns.structural.facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This is the class which provide a single interface to the users of the library simplifying the interaction.
 *
 * Created by PC_02 on 02/12/2015.
 */
public class BuildingFacade {

    private final List<BuildingTradeWorker> workers;

    public BuildingFacade() {
        this.workers = new ArrayList<>();
        workers.add(new CartOperator());
        workers.add(new StoneMason());
        workers.add(new BrickLayer());
    }

    public void startNewDay() {
        makeActions(workers, BuildingTradeWorker.Action.WAKE_UP, BuildingTradeWorker.Action.GO_TO_BUILDING);
    }

    public void digOutGold() {
        makeActions(workers, BuildingTradeWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, BuildingTradeWorker.Action.GO_HOME, BuildingTradeWorker.Action.GO_TO_SLEEP);
    }

    private void makeActions(Collection<BuildingTradeWorker> workers,
                             BuildingTradeWorker.Action... actions) {
        for (BuildingTradeWorker worker : workers) {
            worker.action(actions);
        }
    }
}
