package com.vtellez.apps.design.patterns.adapter;

/**
 * This interface represents a file explorer which is used by the S.O. to manage files.
 *
 * Created by Victor Tellez on 19/11/2015.
 */
public interface FileExplorer {
    /**
     * Creates a file.
     */
    void createFile();

    /**
     * Removes a file.
     */
    void removeFile();

    /**
     * Reads a file.
     */
    void readFile();

    /**
     * Write a file.
     */
    void writeFile();
}
