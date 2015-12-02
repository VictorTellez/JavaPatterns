package com.vtellez.apps.design.patterns.structural.facade;

/**
 * Created by PC_02 on 02/12/2015.
 */
public abstract class BuildingTradeWorker {

    /**
     * Actions enum.
     */
    public static enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_BUILDING, WORK
    }

    /**
     * Gets the name.
     *
     * @return  name
     */
    public abstract String name();

    /**
     * Works.
     */
    public abstract void work();

    /**
     * Goes to sleep.
     */
    public void goToSleep() {
        System.out.println(name() + " goes to sleep.");
    }

    /**
     * Wakes up.
     */
    public void wakeUp() {
        System.out.println(name() + " wakes up.");
    }

    /**
     * Goes home.
     */
    public void goHome() {
        System.out.println(name() + " goes home.");
    }

    /**
     * Goes to job.
     */
    public void goToJob() {
        System.out.println(name() + " goes to job.");
    }

    /**
     * Manage the actions.
     *
     * @param actions   to be made
     */
    public void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

    /**
     * Performs an action.
     *
     * @param action    to be done
     */
    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_BUILDING:
                goToJob();
                break;
            case WORK:
                work();
                break;
            default:
                System.out.println("Undefined action");
                break;
        }
    }
}
