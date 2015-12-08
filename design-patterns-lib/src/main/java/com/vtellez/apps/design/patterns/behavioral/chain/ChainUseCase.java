package com.vtellez.apps.design.patterns.behavioral.chain;

/**
 * This is an use case of the Chain of responsibility pattern. It correspond to the behavioral
 * group.
 *
 * Created by Victor Tellez on 08/12/2015.
 */
public class ChainUseCase {
    /**
     * Gets a chain of loggers.
     *
     * @return  logger
     */
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger =    new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger =     new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger =  new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        // Gets the chain of loggers
        AbstractLogger loggerChain = getChainOfLoggers();

        // Log the messages
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error level.");
    }























}
