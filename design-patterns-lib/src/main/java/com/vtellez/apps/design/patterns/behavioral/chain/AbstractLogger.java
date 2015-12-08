package com.vtellez.apps.design.patterns.behavioral.chain;

/**
 * Created by Victor Tellez on 08/12/2015.
 */
public abstract class AbstractLogger {
    /**
     * Constants to know the type of logger.
     */
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    /**
     * Level of the logger.
     */
    protected int level;

    /**
     * Next logger.
     */
    protected AbstractLogger nextLogger;

    /**
     * Sets the next logger.
     *
     * @param nextLogger    to be set
     */
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * Logs the message.
     *
     * @param level     of the logger
     * @param message   to be log
     */
    public void logMessage(int level, String message) {
        if(this.level <= level) {
            write(message);
        }
        if(nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * Writes the message.
     *
     * @param message   to be write
     */
    abstract protected void write(String message);
}
