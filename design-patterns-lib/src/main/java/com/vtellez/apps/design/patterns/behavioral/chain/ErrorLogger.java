package com.vtellez.apps.design.patterns.behavioral.chain;

/**
 * This class represents the error logger.
 * 
 * Created by Victor Tellez on 08/12/2015.
 */
public class ErrorLogger extends AbstractLogger {
    /**
     * Constructor.
     *
     * @param level     of the logger
     */
    public ErrorLogger(int level) {
        this.level = level;
    }

    /**
     * Writes the message.
     *
     * @param message   to be write
     */
    @Override
    protected void write(String message) {
        System.out.println("Error console::Logger: " + message);
    }
}
