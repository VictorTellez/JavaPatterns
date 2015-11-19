package com.vtellez.apps.design.patterns.adapter;

/**
 * This interface represents a file explorer which is used by the S.O. to manage files.
 *
 * Created by Victor Tellez on 19/11/2015.
 */
public class FileExplorerManager implements FileExplorer {

    private FileExplorer fileExplorer;

    public FileExplorerManager() {
        fileExplorer = new CardReaderAdapter();
    }

    /**
     * Creates a file.
     */
    public void createFile(){
        fileExplorer.createFile();
    }

    /**
     * Removes a file.
     */
    public void removeFile(){
        fileExplorer.removeFile();
    }

    /**
     * Reads a file.
     */
    public void readFile(){
        fileExplorer.readFile();
    }

    /**
     * Write a file.
     */
    public void writeFile(){
        fileExplorer.writeFile();
    }
}
