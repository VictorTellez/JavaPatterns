package com.vtellez.apps.design.patterns.behavioral.chain;

/**
 * This class represents the file logger.
 *
 * Created by Victor Tellez on 08/12/2015.
 */
public class FileLogger extends AbstractLogger {
    /**
     * Constructor.
     *
     * @param level     of the logger
     */
    public FileLogger(int level) {
        this.level = level;
    }

    /**
     * Writes the message.
     *
     * @param message   to be write
     */
    @Override
    protected void write(String message) {
        System.out.println("File console::Logger: " + message);
    }
}
