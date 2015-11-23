package com.vtellez.apps.design.patterns.adapter;

/**
 * This is the class Adapter to adapt the memory card to the file system explorer.
 *
 * Created by Victor Tellez on 19/11/2015.
 */
public class CardReaderAdapter implements FileExplorer {

    private MemoryCard memoryCard;

    /**
     * Constructor.
     */
    public CardReaderAdapter() {
        this.memoryCard = new MemoryCard();
    }

    /**
     * Creates a file writing in the memory card.
     */
    @Override
    public void createFile() {
        memoryCard.writeData();
    }

    /**
     * Removes a file writing in the memory card.
     */
    @Override
    public void removeFile() {
        memoryCard.writeData();
    }

    /**
     * Read a file reading in the memory card.
     */
    @Override
    public void readFile() {
        memoryCard.readData();
    }

    /**
     * Writes a files writing in the memory card.
     */
    @Override
    public void writeFile() {
        memoryCard.writeData();
    }
}
